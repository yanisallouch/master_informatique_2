package fr.univ_montpellier.fsd.sudoku.imp;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class Sudoku {

	int n;
	int s;
	int[][] grid;

	/*
	 * Create an instance of the problem sudoku (nxn)
	 * 
	 */

	public Sudoku(int n) {
		this.n = n;
		this.s = (int) Math.sqrt(n);
		this.grid = new int[n][n];
	}

	/*
	 * check if this.grid is a correct sudoku solution.
	 * 
	 */

	private boolean solutionChecker() {
		// TODO
		return false;

	}

	/*
	 * Generate a random grid solution
	 * 
	 */

	private void generateSolution() {
		// TODO

	}

	/*
	 * Find a solution to the sudoku problem
	 * 
	 */
	public void findSolution() {

		// TODO
	}

	public static void main(String args[]) {
		new Sudoku(4).findSolution();

	}
}
