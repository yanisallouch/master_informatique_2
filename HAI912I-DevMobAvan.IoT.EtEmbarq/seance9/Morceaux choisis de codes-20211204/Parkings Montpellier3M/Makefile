CXX = g++
CXXFLAGS = -Wall -Wextra -ansi -pedantic -std=c++11 -D__TEST_PARKINGS_LOCALISATIONS__

PROG = test_parkings
HEADERS = parkings.h
SOURCES = parkings.cpp
RM=rm

.SUFFIXES = .cpp .h

.cpp.o:
	$(CXX) -c $(CXXFLAGS) $< -o $@

$(PROG): $(SOURCES:.cpp=.o)
	$(CXX) $(LDFLAGS) $^ -o $@

clean:
	$(RM) -f *.o
	$(RM) -f *~
	$(RM) -f $(PROG)
