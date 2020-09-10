//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no1;

import java.util.Random;

public class Matrix {
	private int row,col;
	private int [][]data;
	Random ran = new Random();
	public Matrix(int row,int col) {
		super();
		this.row = row;
		this.col = col;
		this.data = new int[row][col];
	}
	public Matrix(int row,int col,boolean genData) {
		super();
		this.row = row;
		this.col = col;
		this.data = new int[this.row][this.col];
		if(genData) {
			for(int i = 0; i<data.length; i++) {
				for(int j = 0; j<data[i].length; j++) {
					data[i][j] = ran.nextInt(10);
				}
			}
		} else {
			for(int i = 0; i<data.length; i++) {
				for(int j = 0; j<data[i].length; j++) {
					data[i][j] = 0;
				}
			}
		}
	}
	public Matrix plus(Matrix another) {
		Matrix answer = new Matrix(this.row,this.col);
		if(this.row != another.row || this.col != another.col) {
			System.out.print("Error, can only sum matrix with the same dimension.");
			answer.data = null;
		} else {
			for(int i = 0; i<data.length; i++) {
				for(int j = 0; j<data[i].length; j++) {
					answer.data[i][j] = this.data[i][j]+another.data[i][j];
				}
			}
		}
		return answer;
	}
	public void printData() {
		if(data != null) {
			for(int i = 0; i<data.length; i++) {
				for(int j = 0; j<data[i].length; j++) {
					System.out.print(data[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("--------------------------------------");
		} else {
		System.out.println();
		}
	}
	public Matrix multiply(Matrix another) {
		Matrix answer = new Matrix(this.row,this.row);
		if(this.row != another.col) {
			System.out.print("Error, cannot multiply.");
			answer.data = null;
		} else {
			for(int a = 0; a<data.length; a++) {
				for(int b = 0; b<another.data[0].length;b++) {
					for(int c = 0; c<another.data.length;c++)
					answer.data[a][b] += data[a][c]*another.data[c][b];
				}
			}
		}
		return answer;
	}
	public Matrix transpose() {
		Matrix answer = new Matrix(data[0].length,data.length);
		for(int i = 0; i<data.length; i++) {
			for(int j = 0; j<data[0].length; j++) {
				answer.data[j][i] = data[i][j];
			}
		}
		return answer;
	}
}
