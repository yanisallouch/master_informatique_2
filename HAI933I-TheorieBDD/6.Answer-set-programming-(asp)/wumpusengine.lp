%% INSTANCE DATA

#const maxarrow = 1.
#const nbrows = 4.
#const nbcolumns = 4.
#const maxtime = 15.

time(1..maxtime).
column(1..nbcolumns).
row(1..nbrows).
arrows(0..maxarrow).
hasarrows(maxarrow, 0).
livewumpus(0).
livetreasure(0).

wumpus(1, 3).
pit(3, 1).
pit(3, 3).
pit(4, 4).
treasure(2, 3).
hero(1, 1, 0).

%% ENVIRONMENT

% connectivity

zone(X, Y) :- column(X), row(Y).
north(X, Y, Z, T) :- zone(X, Y), zone(Z, T), X = Z, Y = T+1.
south(Z, T, X, Y) :- north(X, Y, Z, T).
east(X, Y, Z, T)  :- zone(X, Y), zone(Z, T), X = Z+1, Y = T.
west(Z, T, X, Y) :- east(X, Y, Z, T).
connected(X, Y, Z, T) :- north(X, Y, Z, T).
connected(X, Y, Z, T) :- south(X, Y, Z, T).
connected(X, Y, Z, T) :- east(X, Y, Z, T).
connected(X, Y, Z, T) :- west(X, Y, Z, T).

% actions

:- action(A1, D1, N), action(A2, D2, N), A1 != A2.
:- action(A1, D1, N), action(A2, D2, N), D1 != D2.

hero(X, Y, N+1) :- action(shoot, D, N), time(N+1), hero(X, Y, N).
shoot(D, N+1)   :- action(shoot, D, N), hasarrows(K, N), K > 0, time(N+1).
shooting(N) :- shoot(D, N).
hasarrows(K-1, N)  :- shoot(D, N), hasarrows(K, N-1), arrows(K-1).
hasarrows(K, N+1)  :- hasarrows(K, N), time(N+1), not shooting(N+1).
headshot(N)        :- hero(X1, Y1, N), wumpus(X2, Y2), shoot(north, N), X1 = X2, Y1 < Y2.
headshot(N)        :- hero(X1, Y1, N), wumpus(X2, Y2), shoot(south, N), X1 = X2, Y1 > Y2.
headshot(N)        :- hero(X1, Y1, N), wumpus(X2, Y2), shoot(west, N), X1 < X2, Y1 = Y2.
headshot(N)        :- hero(X1, Y1, N), wumpus(X2, Y2), shoot(east, N), X1 > X2, Y1 = Y2.
scream(N)          :- headshot(N), livewumpus(N-1).
livewumpus(N)      :- livewumpus(N-1), time(N), hero(X, Y, N), not headshot(N).

hero(X, Y+1, N+1) :- hero(X, Y, N), action(move, north, N), time(N+1), zone(X, Y+1).
hero(X, Y, N+1) :- hero(X, Y, N), action(move, north, N), time(N+1), not zone(X, Y+1).
hero(X, Y-1, N+1) :- hero(X, Y, N), action(move, south, N), time(N+1), zone(X, Y-1).
hero(X, Y, N+1) :- hero(X, Y, N), action(move, south, N), time(N+1), not zone(X, Y-1).
hero(X+1, Y, N+1):- hero(X, Y, N), action(move, east, N), time(N+1), zone(X+1, Y).
hero(X, Y, N+1) :- hero(X, Y, N), action(move, east, N), time(N+1), not zone(X+1, Y).
hero(X-1, Y, N+1):- hero(X, Y, N), action(move, west, N), time(N+1), zone(X-1, Y).
hero(X, Y, N+1) :- hero(X, Y, N), action(move, west, N), time(N+1), not zone(X-1, Y).

picktreasure(N+1) :- hero(X, Y, N), treasure(X, Y), action(pick, U, N), livetreasure(N), time(N+1).
hero(X, Y, N+1) :- hero(X, Y, N), action(pick, U, N), time(N+1).                
livetreasure(N+1) :- hero(X, Y, N+1), livetreasure(N), not picktreasure(N).

% perceptions

stench(Z, T) :- wumpus(X, Y), zone(Z, T), connected(X, Y, Z, T).
breeze(Z, T) :- pit(X, Y), zone(Z, T), connected(X, Y, Z, T).
glitter(X, Y):- treasure(X, Y).

feelstench(X, Y, N) :- hero(X, Y, N), stench(X, Y).
feelbreeze(X, Y, N) :- hero(X, Y, N), breeze(X, Y).
feelglitter(X, Y, N) :- hero(X, Y, N), glitter(X, Y), livetreasure(N).

% death of a hero

deadhero(X, Y, N) :- hero(X, Y, N), wumpus(X, Y), livewumpus(N).
deadhero(X, Y, N) :- hero(X, Y, N), pit(X, Y).
:- deadhero(X, Y, N).

% victory

victory(N) :- hero(X, Y, N), hero(X, Y, 0), not livetreasure(N).

