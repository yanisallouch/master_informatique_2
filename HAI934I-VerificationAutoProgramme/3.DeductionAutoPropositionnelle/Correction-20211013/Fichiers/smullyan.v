(* $Id$ *)

Parameters PC1 PC2 TC1 TC2 : Prop.

Definition A1 : Prop := PC1 /\ TC2.
Definition A2 : Prop := (PC1 /\ TC2) \/ (PC2 /\ TC1).
Definition HY1 : Prop := (A1 /\ ~A2) \/ (A2 /\ ~A1).
Definition HN2 : Prop := (PC1 \/ TC1) /\ ~(PC1 /\ TC1) /\ (PC2 \/ TC2) /\ ~(PC2 /\ TC2).

Lemma E1 : HY1 /\ HN2 -> TC1 /\ PC2.
Proof.
unfold HY1, HN2, A1, A2.
intros.
destruct H; destruct H0; destruct H1; destruct H2; destruct H; destruct H.
(*A1 vraie, A2 fausse*)
destruct H4; left; assumption.
(*A1 fausse, A2 vraie*)
destruct H.
destruct H4; assumption.
destruct H; split; assumption.
Qed.
