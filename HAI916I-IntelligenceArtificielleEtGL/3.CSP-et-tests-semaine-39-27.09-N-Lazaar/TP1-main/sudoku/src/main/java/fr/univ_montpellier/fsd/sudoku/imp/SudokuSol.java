package fr.univ_montpellier.fsd.sudoku.imp;

import java.time.Duration;
import java.time.Instant;

public class SudokuSol {

	int n;
	int s;
	int[][] grid;
	public static int counter; // counter to count the number of recursive calls

	/*
	 * Create an instance of the problem sudoku (nxn)
	 * 
	 */

	public SudokuSol(int n) {
		this.n = n;
		this.s = (int) Math.sqrt(n);
		this.grid = new int[n][n];
	}

	/************************************
	 * check if the value val is already used in column col
	 * 
	 * @param val
	 * @param col
	 * @return true/false
	 *************************************/

	public boolean alreadyInCol(int val, int col) {
		// TODO
		return false;
	}

	/************************************
	 * check if the value val is already used in row row
	 * 
	 * @param val
	 * @param row
	 * @return true/false
	 *************************************/

	public boolean alreadyInRow(int val, int row) {
		// TODO
		return false;
	}

	/*************************************
	 * check if the value val is already used in the square containing the cell
	 * grid[row][col]
	 * 
	 * @param val
	 * @param row
	 * @param col
	 * @return true/false
	 *************************************/

	public boolean alreadyInSquare(int val, int row, int col) {

		// TODO

		return false;
	}

	/*************************************
	 * check if the value val is: 
	 * 1- already used in column col 
	 * 2- already used in row row 
	 * 3- already used in the square containing the cell grid[row][col]
	 * 
	 * @param val
	 * @param row
	 * @param col
	 * @return true/false
	 *************************************/
	public boolean isPossible(int valeur, int row, int col) {
		// todo

		return false;

	}

	/*************************************
	 * Print solution function
	 * 
	 * 
	 **************************************/
	public void print() {
	}

	/***************************************
	 * Find a solution to sudoku n x n starting with grid[0][0] as initial point
	 * 
	 * @param row
	 * @param col
	 * @return
	 **************************************/
	public boolean findSolution(int row, int col) {

		// TODO: increment the number of recursive calls

		int nextRow; // next row to fill
		int nextCol; // next col to fill

		///////////////////////////////////////////////
		// TODO: if col = n-1 it means that we need to go to the new row, first column.
		// Otherwise, we make a step forward in column

		///////////////////////////////////////////////
		// Now if after incrementing #row we are out the grid it means that we are at
		// the last recursive call
		// and we have just to print the solution

		/////////////////////////////////////////////// 
		// MAIN LOOP: try if a value is possible for grid[row][col] 
		// if yes, we make a recursive call for the next cell to fill
		// Otherwise, no value is possible for that cell, we reset it to zero and we return false 
	
		return false;
	}

	public static void main(String[] a) {
		
		counter = 0;

		Instant start = Instant.now();

		System.out.println(new SudokuSol(9).findSolution(0, 0) + "\n #recursive_calls=" + counter);

		Instant end = Instant.now();

		System.out.println(Duration.between(start, end));

	}
}