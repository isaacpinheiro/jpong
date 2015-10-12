public class Scenario implements Runnable {

	public static final int WIDTH = 57;
	public static final int HEIGHT = 31;

	private String scenario[][];
	private Components ball;
	private Components player1;
	private Components player2;

	public Scenario(){

		scenario = new String[HEIGHT][WIDTH];

		for(int i=0; i<HEIGHT; i++){
			for(int j=0; j<WIDTH; j++){
				if(i == 0 || i == (HEIGHT - 1) || j == 0 || j == (WIDTH - 1)){
					this.scenario[i][j] = "#";
				}else {
					this.scenario[i][j] = " ";
				}
			}
		}

	}

	public void setBall(Components ball){
		this.ball = ball;
	}

	public Components getBall(){
		return this.ball;
	}

	public void setPlayer1(Components player1){
		this.player1 = player1;
	}

	public Components getPlayer1(){
		return this.player1;
	}

	public void setPlayer2(Components player2){
		this.player2 = player2;
	}

	public Components getPlayer2(){
		return this.player2;
	}

	public void drawScenario(){

		System.out.print("\033[2J");

		System.out.println(
			scenario[0][0] + scenario[0][1] + scenario[0][2] + scenario[0][3] + scenario[0][4] + scenario[0][5] + scenario[0][6] +
			scenario[0][7] + scenario[0][8] + scenario[0][9] + scenario[0][10] + scenario[0][11] + scenario[0][12] + scenario[0][13] +
			scenario[0][14] + scenario[0][15] + scenario[0][16] + scenario[0][17] + scenario[0][18] + scenario[0][19] + scenario[0][20] +
			scenario[0][21] + scenario[0][22] + scenario[0][23] + scenario[0][24] + scenario[0][25] + scenario[0][26] + scenario[0][27] +
			scenario[0][28] + scenario[0][29] + scenario[0][30] + scenario[0][31] + scenario[0][32] + scenario[0][33] + scenario[0][34] +
			scenario[0][35] + scenario[0][36] + scenario[0][37] + scenario[0][38] + scenario[0][39] + scenario[0][40] + scenario[0][41] +
			scenario[0][42] + scenario[0][43] + scenario[0][44] + scenario[0][45] + scenario[0][46] + scenario[0][47] + scenario[0][48] +
			scenario[0][49] + scenario[0][50] + scenario[0][51] + scenario[0][52] + scenario[0][53] + scenario[0][54] + scenario[0][55] +
			scenario[0][56]);

		System.out.println(
			scenario[1][0] + scenario[1][1] + scenario[1][2] + scenario[1][3] + scenario[1][4] + scenario[1][5] + scenario[1][6] +
			scenario[1][7] + scenario[1][8] + scenario[1][9] + scenario[1][10] + scenario[1][11] + scenario[1][12] + scenario[1][13] +
			scenario[1][14] + scenario[1][15] + scenario[1][16] + scenario[1][17] + scenario[1][18] + scenario[1][19] + scenario[1][20] +
			scenario[1][21] + scenario[1][22] + scenario[1][23] + scenario[1][24] + scenario[1][25] + scenario[1][26] + scenario[1][27] +
			scenario[1][28] + scenario[1][29] + scenario[1][30] + scenario[1][31] + scenario[1][32] + scenario[1][33] + scenario[1][34] +
			scenario[1][35] + scenario[1][36] + scenario[1][37] + scenario[1][38] + scenario[1][39] + scenario[1][40] + scenario[1][41] +
			scenario[1][42] + scenario[1][43] + scenario[1][44] + scenario[1][45] + scenario[1][46] + scenario[1][47] + scenario[1][48] +
			scenario[1][49] + scenario[1][50] + scenario[1][51] + scenario[1][52] + scenario[1][53] + scenario[1][54] + scenario[1][55] +
			scenario[1][56]);

		System.out.println(
			scenario[2][0] + scenario[2][1] + scenario[2][2] + scenario[2][3] + scenario[2][4] + scenario[2][5] + scenario[2][6] +
			scenario[2][7] + scenario[2][8] + scenario[2][9] + scenario[2][10] + scenario[2][11] + scenario[2][12] + scenario[2][13] +
			scenario[2][14] + scenario[2][15] + scenario[2][16] + scenario[2][17] + scenario[2][18] + scenario[2][19] + scenario[2][20] +
			scenario[2][21] + scenario[2][22] + scenario[2][23] + scenario[2][24] + scenario[2][25] + scenario[2][26] + scenario[2][27] +
			scenario[2][28] + scenario[2][29] + scenario[2][30] + scenario[2][31] + scenario[2][32] + scenario[2][33] + scenario[2][34] +
			scenario[2][35] + scenario[2][36] + scenario[2][37] + scenario[2][38] + scenario[2][39] + scenario[2][40] + scenario[2][41] +
			scenario[2][42] + scenario[2][43] + scenario[2][44] + scenario[2][45] + scenario[2][46] + scenario[2][47] + scenario[2][48] +
			scenario[2][49] + scenario[2][50] + scenario[2][51] + scenario[2][52] + scenario[2][53] + scenario[2][54] + scenario[2][55] +
			scenario[2][56]);

		System.out.println(
			scenario[3][0] + scenario[3][1] + scenario[3][2] + scenario[3][3] + scenario[3][4] + scenario[3][5] + scenario[3][6] +
			scenario[3][7] + scenario[3][8] + scenario[3][9] + scenario[3][10] + scenario[3][11] + scenario[3][12] + scenario[3][13] +
			scenario[3][14] + scenario[3][15] + scenario[3][16] + scenario[3][17] + scenario[3][18] + scenario[3][19] + scenario[3][20] +
			scenario[3][21] + scenario[3][22] + scenario[3][23] + scenario[3][24] + scenario[3][25] + scenario[3][26] + scenario[3][27] +
			scenario[3][28] + scenario[3][29] + scenario[3][30] + scenario[3][31] + scenario[3][32] + scenario[3][33] + scenario[3][34] +
			scenario[3][35] + scenario[3][36] + scenario[3][37] + scenario[3][38] + scenario[3][39] + scenario[3][40] + scenario[3][41] +
			scenario[3][42] + scenario[3][43] + scenario[3][44] + scenario[3][45] + scenario[3][46] + scenario[3][47] + scenario[3][48] +
			scenario[3][49] + scenario[3][50] + scenario[3][51] + scenario[3][52] + scenario[3][53] + scenario[3][54] + scenario[3][55] +
			scenario[3][56]);

		System.out.println(
			scenario[4][0] + scenario[4][1] + scenario[4][2] + scenario[4][3] + scenario[4][4] + scenario[4][5] + scenario[4][6] +
			scenario[4][7] + scenario[4][8] + scenario[4][9] + scenario[4][10] + scenario[4][11] + scenario[4][12] + scenario[4][13] +
			scenario[4][14] + scenario[4][15] + scenario[4][16] + scenario[4][17] + scenario[4][18] + scenario[4][19] + scenario[4][20] +
			scenario[4][21] + scenario[4][22] + scenario[4][23] + scenario[4][24] + scenario[4][25] + scenario[4][26] + scenario[4][27] +
			scenario[4][28] + scenario[4][29] + scenario[4][30] + scenario[4][31] + scenario[4][32] + scenario[4][33] + scenario[4][34] +
			scenario[4][35] + scenario[4][36] + scenario[4][37] + scenario[4][38] + scenario[4][39] + scenario[4][40] + scenario[4][41] +
			scenario[4][42] + scenario[4][43] + scenario[4][44] + scenario[4][45] + scenario[4][46] + scenario[4][47] + scenario[4][48] +
			scenario[4][49] + scenario[4][50] + scenario[4][51] + scenario[4][52] + scenario[4][53] + scenario[4][54] + scenario[4][55] +
			scenario[4][56]);

		System.out.println(
			scenario[5][0] + scenario[5][1] + scenario[5][2] + scenario[5][3] + scenario[5][4] + scenario[5][5] + scenario[5][6] +
			scenario[5][7] + scenario[5][8] + scenario[5][9] + scenario[5][10] + scenario[5][11] + scenario[5][12] + scenario[5][13] +
			scenario[5][14] + scenario[5][15] + scenario[5][16] + scenario[5][17] + scenario[5][18] + scenario[5][19] + scenario[5][20] +
			scenario[5][21] + scenario[5][22] + scenario[5][23] + scenario[5][24] + scenario[5][25] + scenario[5][26] + scenario[5][27] +
			scenario[5][28] + scenario[5][29] + scenario[5][30] + scenario[5][31] + scenario[5][32] + scenario[5][33] + scenario[5][34] +
			scenario[5][35] + scenario[5][36] + scenario[5][37] + scenario[5][38] + scenario[5][39] + scenario[5][40] + scenario[5][41] +
			scenario[5][42] + scenario[5][43] + scenario[5][44] + scenario[5][45] + scenario[5][46] + scenario[5][47] + scenario[5][48] +
			scenario[5][49] + scenario[5][50] + scenario[5][51] + scenario[5][52] + scenario[5][53] + scenario[5][54] + scenario[5][55] +
			scenario[5][56]);

		System.out.println(
			scenario[6][0] + scenario[6][1] + scenario[6][2] + scenario[6][3] + scenario[6][4] + scenario[6][5] + scenario[6][6] +
			scenario[6][7] + scenario[6][8] + scenario[6][9] + scenario[6][10] + scenario[6][11] + scenario[6][12] + scenario[6][13] +
			scenario[6][14] + scenario[6][15] + scenario[6][16] + scenario[6][17] + scenario[6][18] + scenario[6][19] + scenario[6][20] +
			scenario[6][21] + scenario[6][22] + scenario[6][23] + scenario[6][24] + scenario[6][25] + scenario[6][26] + scenario[6][27] +
			scenario[6][28] + scenario[6][29] + scenario[6][30] + scenario[6][31] + scenario[6][32] + scenario[6][33] + scenario[6][34] +
			scenario[6][35] + scenario[6][36] + scenario[6][37] + scenario[6][38] + scenario[6][39] + scenario[6][40] + scenario[6][41] +
			scenario[6][42] + scenario[6][43] + scenario[6][44] + scenario[6][45] + scenario[6][46] + scenario[6][47] + scenario[6][48] +
			scenario[6][49] + scenario[6][50] + scenario[6][51] + scenario[6][52] + scenario[6][53] + scenario[6][54] + scenario[6][55] +
			scenario[6][56]);

		System.out.println(
			scenario[7][0] + scenario[7][1] + scenario[7][2] + scenario[7][3] + scenario[7][4] + scenario[7][5] + scenario[7][6] +
			scenario[7][7] + scenario[7][8] + scenario[7][9] + scenario[7][10] + scenario[7][11] + scenario[7][12] + scenario[7][13] +
			scenario[7][14] + scenario[7][15] + scenario[7][16] + scenario[7][17] + scenario[7][18] + scenario[7][19] + scenario[7][20] +
			scenario[7][21] + scenario[7][22] + scenario[7][23] + scenario[7][24] + scenario[7][25] + scenario[7][26] + scenario[7][27] +
			scenario[7][28] + scenario[7][29] + scenario[7][30] + scenario[7][31] + scenario[7][32] + scenario[7][33] + scenario[7][34] +
			scenario[7][35] + scenario[7][36] + scenario[7][37] + scenario[7][38] + scenario[7][39] + scenario[7][40] + scenario[7][41] +
			scenario[7][42] + scenario[7][43] + scenario[7][44] + scenario[7][45] + scenario[7][46] + scenario[7][47] + scenario[7][48] +
			scenario[7][49] + scenario[7][50] + scenario[7][51] + scenario[7][52] + scenario[7][53] + scenario[7][54] + scenario[7][55] +
			scenario[7][56]);

		System.out.println(
			scenario[7][0] + scenario[7][1] + scenario[7][2] + scenario[7][3] + scenario[7][4] + scenario[7][5] + scenario[7][6] +
			scenario[7][7] + scenario[7][8] + scenario[7][9] + scenario[7][10] + scenario[7][11] + scenario[7][12] + scenario[7][13] +
			scenario[7][14] + scenario[7][15] + scenario[7][16] + scenario[7][17] + scenario[7][18] + scenario[7][19] + scenario[7][20] +
			scenario[7][21] + scenario[7][22] + scenario[7][23] + scenario[7][24] + scenario[7][25] + scenario[7][26] + scenario[7][27] +
			scenario[7][28] + scenario[7][29] + scenario[7][30] + scenario[7][31] + scenario[7][32] + scenario[7][33] + scenario[7][34] +
			scenario[7][35] + scenario[7][36] + scenario[7][37] + scenario[7][38] + scenario[7][39] + scenario[7][40] + scenario[7][41] +
			scenario[7][42] + scenario[7][43] + scenario[7][44] + scenario[7][45] + scenario[7][46] + scenario[7][47] + scenario[7][48] +
			scenario[7][49] + scenario[7][50] + scenario[7][51] + scenario[7][52] + scenario[7][53] + scenario[7][54] + scenario[7][55] +
			scenario[7][56]);

		System.out.println(
			scenario[8][0] + scenario[8][1] + scenario[8][2] + scenario[8][3] + scenario[8][4] + scenario[8][5] + scenario[8][6] +
			scenario[8][7] + scenario[8][8] + scenario[8][9] + scenario[8][10] + scenario[8][11] + scenario[8][12] + scenario[8][13] +
			scenario[8][14] + scenario[8][15] + scenario[8][16] + scenario[8][17] + scenario[8][18] + scenario[8][19] + scenario[8][20] +
			scenario[8][21] + scenario[8][22] + scenario[8][23] + scenario[8][24] + scenario[8][25] + scenario[8][26] + scenario[8][27] +
			scenario[8][28] + scenario[8][29] + scenario[8][30] + scenario[8][31] + scenario[8][32] + scenario[8][33] + scenario[8][34] +
			scenario[8][35] + scenario[8][36] + scenario[8][37] + scenario[8][38] + scenario[8][39] + scenario[8][40] + scenario[8][41] +
			scenario[8][42] + scenario[8][43] + scenario[8][44] + scenario[8][45] + scenario[8][46] + scenario[8][47] + scenario[8][48] +
			scenario[8][49] + scenario[8][50] + scenario[8][51] + scenario[8][52] + scenario[8][53] + scenario[8][54] + scenario[8][55] +
			scenario[8][56]);

		System.out.println(
			scenario[9][0] + scenario[9][1] + scenario[9][2] + scenario[9][3] + scenario[9][4] + scenario[9][5] + scenario[9][6] +
			scenario[9][7] + scenario[9][8] + scenario[9][9] + scenario[9][10] + scenario[9][11] + scenario[9][12] + scenario[9][13] +
			scenario[9][14] + scenario[9][15] + scenario[9][16] + scenario[9][17] + scenario[9][18] + scenario[9][19] + scenario[9][20] +
			scenario[9][21] + scenario[9][22] + scenario[9][23] + scenario[9][24] + scenario[9][25] + scenario[9][26] + scenario[9][27] +
			scenario[9][28] + scenario[9][29] + scenario[9][30] + scenario[9][31] + scenario[9][32] + scenario[9][33] + scenario[9][34] +
			scenario[9][35] + scenario[9][36] + scenario[9][37] + scenario[9][38] + scenario[9][39] + scenario[9][40] + scenario[9][41] +
			scenario[9][42] + scenario[9][43] + scenario[9][44] + scenario[9][45] + scenario[9][46] + scenario[9][47] + scenario[9][48] +
			scenario[9][49] + scenario[9][50] + scenario[9][51] + scenario[9][52] + scenario[9][53] + scenario[9][54] + scenario[9][55] +
			scenario[9][56]);

		System.out.println(
			scenario[10][0] + scenario[10][1] + scenario[10][2] + scenario[10][3] + scenario[10][4] + scenario[10][5] + scenario[10][6] +
			scenario[10][7] + scenario[10][8] + scenario[10][9] + scenario[10][10] + scenario[10][11] + scenario[10][12] + scenario[10][13] +
			scenario[10][14] + scenario[10][15] + scenario[10][16] + scenario[10][17] + scenario[10][18] + scenario[10][19] + scenario[10][20] +
			scenario[10][21] + scenario[10][22] + scenario[10][23] + scenario[10][24] + scenario[10][25] + scenario[10][26] + scenario[10][27] +
			scenario[10][28] + scenario[10][29] + scenario[10][30] + scenario[10][31] + scenario[10][32] + scenario[10][33] + scenario[10][34] +
			scenario[10][35] + scenario[10][36] + scenario[10][37] + scenario[10][38] + scenario[10][39] + scenario[10][40] + scenario[10][41] +
			scenario[10][42] + scenario[10][43] + scenario[10][44] + scenario[10][45] + scenario[10][46] + scenario[10][47] + scenario[10][48] +
			scenario[10][49] + scenario[10][50] + scenario[10][51] + scenario[10][52] + scenario[10][53] + scenario[10][54] + scenario[10][55] +
			scenario[10][56]);

		System.out.println(
			scenario[11][0] + scenario[11][1] + scenario[11][2] + scenario[11][3] + scenario[11][4] + scenario[11][5] + scenario[11][6] +
			scenario[11][7] + scenario[11][8] + scenario[11][9] + scenario[11][10] + scenario[11][11] + scenario[11][12] + scenario[11][13] +
			scenario[11][14] + scenario[11][15] + scenario[11][16] + scenario[11][17] + scenario[11][18] + scenario[11][19] + scenario[11][20] +
			scenario[11][21] + scenario[11][22] + scenario[11][23] + scenario[11][24] + scenario[11][25] + scenario[11][26] + scenario[11][27] +
			scenario[11][28] + scenario[11][29] + scenario[11][30] + scenario[11][31] + scenario[11][32] + scenario[11][33] + scenario[11][34] +
			scenario[11][35] + scenario[11][36] + scenario[11][37] + scenario[11][38] + scenario[11][39] + scenario[11][40] + scenario[11][41] +
			scenario[11][42] + scenario[11][43] + scenario[11][44] + scenario[11][45] + scenario[11][46] + scenario[11][47] + scenario[11][48] +
			scenario[11][49] + scenario[11][50] + scenario[11][51] + scenario[11][52] + scenario[11][53] + scenario[11][54] + scenario[11][55] +
			scenario[11][56]);

		System.out.println(
			scenario[12][0] + scenario[12][1] + scenario[12][2] + scenario[12][3] + scenario[12][4] + scenario[12][5] + scenario[12][6] +
			scenario[12][7] + scenario[12][8] + scenario[12][9] + scenario[12][10] + scenario[12][11] + scenario[12][12] + scenario[12][13] +
			scenario[12][14] + scenario[12][15] + scenario[12][16] + scenario[12][17] + scenario[12][18] + scenario[12][19] + scenario[12][20] +
			scenario[12][21] + scenario[12][22] + scenario[12][23] + scenario[12][24] + scenario[12][25] + scenario[12][26] + scenario[12][27] +
			scenario[12][28] + scenario[12][29] + scenario[12][30] + scenario[12][31] + scenario[12][32] + scenario[12][33] + scenario[12][34] +
			scenario[12][35] + scenario[12][36] + scenario[12][37] + scenario[12][38] + scenario[12][39] + scenario[12][40] + scenario[12][41] +
			scenario[12][42] + scenario[12][43] + scenario[12][44] + scenario[12][45] + scenario[12][46] + scenario[12][47] + scenario[12][48] +
			scenario[12][49] + scenario[12][50] + scenario[12][51] + scenario[12][52] + scenario[12][53] + scenario[12][54] + scenario[12][55] +
			scenario[12][56]);

		System.out.println(
			scenario[13][0] + scenario[13][1] + scenario[13][2] + scenario[13][3] + scenario[13][4] + scenario[13][5] + scenario[13][6] +
			scenario[13][7] + scenario[13][8] + scenario[13][9] + scenario[13][10] + scenario[13][11] + scenario[13][12] + scenario[13][13] +
			scenario[13][14] + scenario[13][15] + scenario[13][16] + scenario[13][17] + scenario[13][18] + scenario[13][19] + scenario[13][20] +
			scenario[13][21] + scenario[13][22] + scenario[13][23] + scenario[13][24] + scenario[13][25] + scenario[13][26] + scenario[13][27] +
			scenario[13][28] + scenario[13][29] + scenario[13][30] + scenario[13][31] + scenario[13][32] + scenario[13][33] + scenario[13][34] +
			scenario[13][35] + scenario[13][36] + scenario[13][37] + scenario[13][38] + scenario[13][39] + scenario[13][40] + scenario[13][41] +
			scenario[13][42] + scenario[13][43] + scenario[13][44] + scenario[13][45] + scenario[13][46] + scenario[13][47] + scenario[13][48] +
			scenario[13][49] + scenario[13][50] + scenario[13][51] + scenario[13][52] + scenario[13][53] + scenario[13][54] + scenario[13][55] +
			scenario[13][56]);

		System.out.println(
			scenario[14][0] + scenario[14][1] + scenario[14][2] + scenario[14][3] + scenario[14][4] + scenario[14][5] + scenario[14][6] +
			scenario[14][7] + scenario[14][8] + scenario[14][9] + scenario[14][10] + scenario[14][11] + scenario[14][12] + scenario[14][13] +
			scenario[14][14] + scenario[14][15] + scenario[14][16] + scenario[14][17] + scenario[14][18] + scenario[14][19] + scenario[14][20] +
			scenario[14][21] + scenario[14][22] + scenario[14][23] + scenario[14][24] + scenario[14][25] + scenario[14][26] + scenario[14][27] +
			scenario[14][28] + scenario[14][29] + scenario[14][30] + scenario[14][31] + scenario[14][32] + scenario[14][33] + scenario[14][34] +
			scenario[14][35] + scenario[14][36] + scenario[14][37] + scenario[14][38] + scenario[14][39] + scenario[14][40] + scenario[14][41] +
			scenario[14][42] + scenario[14][43] + scenario[14][44] + scenario[14][45] + scenario[14][46] + scenario[14][47] + scenario[14][48] +
			scenario[14][49] + scenario[14][50] + scenario[14][51] + scenario[14][52] + scenario[14][53] + scenario[14][54] + scenario[14][55] +
			scenario[14][56]);

		System.out.println(
			scenario[15][0] + scenario[15][1] + scenario[15][2] + scenario[15][3] + scenario[15][4] + scenario[15][5] + scenario[15][6] +
			scenario[15][7] + scenario[15][8] + scenario[15][9] + scenario[15][10] + scenario[15][11] + scenario[15][12] + scenario[15][13] +
			scenario[15][14] + scenario[15][15] + scenario[15][16] + scenario[15][17] + scenario[15][18] + scenario[15][19] + scenario[15][20] +
			scenario[15][21] + scenario[15][22] + scenario[15][23] + scenario[15][24] + scenario[15][25] + scenario[15][26] + scenario[15][27] +
			scenario[15][28] + scenario[15][29] + scenario[15][30] + scenario[15][31] + scenario[15][32] + scenario[15][33] + scenario[15][34] +
			scenario[15][35] + scenario[15][36] + scenario[15][37] + scenario[15][38] + scenario[15][39] + scenario[15][40] + scenario[15][41] +
			scenario[15][42] + scenario[15][43] + scenario[15][44] + scenario[15][45] + scenario[15][46] + scenario[15][47] + scenario[15][48] +
			scenario[15][49] + scenario[15][50] + scenario[15][51] + scenario[15][52] + scenario[15][53] + scenario[15][54] + scenario[15][55] +
			scenario[15][56]);

		System.out.println(
			scenario[16][0] + scenario[16][1] + scenario[16][2] + scenario[16][3] + scenario[16][4] + scenario[16][5] + scenario[16][6] +
			scenario[16][7] + scenario[16][8] + scenario[16][9] + scenario[16][10] + scenario[16][11] + scenario[16][12] + scenario[16][13] +
			scenario[16][14] + scenario[16][15] + scenario[16][16] + scenario[16][17] + scenario[16][18] + scenario[16][19] + scenario[16][20] +
			scenario[16][21] + scenario[16][22] + scenario[16][23] + scenario[16][24] + scenario[16][25] + scenario[16][26] + scenario[16][27] +
			scenario[16][28] + scenario[16][29] + scenario[16][30] + scenario[16][31] + scenario[16][32] + scenario[16][33] + scenario[16][34] +
			scenario[16][35] + scenario[16][36] + scenario[16][37] + scenario[16][38] + scenario[16][39] + scenario[16][40] + scenario[16][41] +
			scenario[16][42] + scenario[16][43] + scenario[16][44] + scenario[16][45] + scenario[16][46] + scenario[16][47] + scenario[16][48] +
			scenario[16][49] + scenario[16][50] + scenario[16][51] + scenario[16][52] + scenario[16][53] + scenario[16][54] + scenario[16][55] +
			scenario[16][56]);

		System.out.println(
			scenario[17][0] + scenario[17][1] + scenario[17][2] + scenario[17][3] + scenario[17][4] + scenario[17][5] + scenario[17][6] +
			scenario[17][7] + scenario[17][8] + scenario[17][9] + scenario[17][10] + scenario[17][11] + scenario[17][12] + scenario[17][13] +
			scenario[17][14] + scenario[17][15] + scenario[17][16] + scenario[17][17] + scenario[17][18] + scenario[17][19] + scenario[17][20] +
			scenario[17][21] + scenario[17][22] + scenario[17][23] + scenario[17][24] + scenario[17][25] + scenario[17][26] + scenario[17][27] +
			scenario[17][28] + scenario[17][29] + scenario[17][30] + scenario[17][31] + scenario[17][32] + scenario[17][33] + scenario[17][34] +
			scenario[17][35] + scenario[17][36] + scenario[17][37] + scenario[17][38] + scenario[17][39] + scenario[17][40] + scenario[17][41] +
			scenario[17][42] + scenario[17][43] + scenario[17][44] + scenario[17][45] + scenario[17][46] + scenario[17][47] + scenario[17][48] +
			scenario[17][49] + scenario[17][50] + scenario[17][51] + scenario[17][52] + scenario[17][53] + scenario[17][54] + scenario[17][55] +
			scenario[17][56]);

		System.out.println(
			scenario[18][0] + scenario[18][1] + scenario[18][2] + scenario[18][3] + scenario[18][4] + scenario[18][5] + scenario[18][6] +
			scenario[18][7] + scenario[18][8] + scenario[18][9] + scenario[18][10] + scenario[18][11] + scenario[18][12] + scenario[18][13] +
			scenario[18][14] + scenario[18][15] + scenario[18][16] + scenario[18][17] + scenario[18][18] + scenario[18][19] + scenario[18][20] +
			scenario[18][21] + scenario[18][22] + scenario[18][23] + scenario[18][24] + scenario[18][25] + scenario[18][26] + scenario[18][27] +
			scenario[18][28] + scenario[18][29] + scenario[18][30] + scenario[18][31] + scenario[18][32] + scenario[18][33] + scenario[18][34] +
			scenario[18][35] + scenario[18][36] + scenario[18][37] + scenario[18][38] + scenario[18][39] + scenario[18][40] + scenario[18][41] +
			scenario[18][42] + scenario[18][43] + scenario[18][44] + scenario[18][45] + scenario[18][46] + scenario[18][47] + scenario[18][48] +
			scenario[18][49] + scenario[18][50] + scenario[18][51] + scenario[18][52] + scenario[18][53] + scenario[18][54] + scenario[18][55] +
			scenario[18][56]);

		System.out.println(
			scenario[19][0] + scenario[19][1] + scenario[19][2] + scenario[19][3] + scenario[19][4] + scenario[19][5] + scenario[19][6] +
			scenario[19][7] + scenario[19][8] + scenario[19][9] + scenario[19][10] + scenario[19][11] + scenario[19][12] + scenario[19][13] +
			scenario[19][14] + scenario[19][15] + scenario[19][16] + scenario[19][17] + scenario[19][18] + scenario[19][19] + scenario[19][20] +
			scenario[19][21] + scenario[19][22] + scenario[19][23] + scenario[19][24] + scenario[19][25] + scenario[19][26] + scenario[19][27] +
			scenario[19][28] + scenario[19][29] + scenario[19][30] + scenario[19][31] + scenario[19][32] + scenario[19][33] + scenario[19][34] +
			scenario[19][35] + scenario[19][36] + scenario[19][37] + scenario[19][38] + scenario[19][39] + scenario[19][40] + scenario[19][41] +
			scenario[19][42] + scenario[19][43] + scenario[19][44] + scenario[19][45] + scenario[19][46] + scenario[19][47] + scenario[19][48] +
			scenario[19][49] + scenario[19][50] + scenario[19][51] + scenario[19][52] + scenario[19][53] + scenario[19][54] + scenario[19][55] +
			scenario[19][56]);

		System.out.println(
			scenario[20][0] + scenario[20][1] + scenario[20][2] + scenario[20][3] + scenario[20][4] + scenario[20][5] + scenario[20][6] +
			scenario[20][7] + scenario[20][8] + scenario[20][9] + scenario[20][10] + scenario[20][11] + scenario[20][12] + scenario[20][13] +
			scenario[20][14] + scenario[20][15] + scenario[20][16] + scenario[20][17] + scenario[20][18] + scenario[20][19] + scenario[20][20] +
			scenario[20][21] + scenario[20][22] + scenario[20][23] + scenario[20][24] + scenario[20][25] + scenario[20][26] + scenario[20][27] +
			scenario[20][28] + scenario[20][29] + scenario[20][30] + scenario[20][31] + scenario[20][32] + scenario[20][33] + scenario[20][34] +
			scenario[20][35] + scenario[20][36] + scenario[20][37] + scenario[20][38] + scenario[20][39] + scenario[20][40] + scenario[20][41] +
			scenario[20][42] + scenario[20][43] + scenario[20][44] + scenario[20][45] + scenario[20][46] + scenario[20][47] + scenario[20][48] +
			scenario[20][49] + scenario[20][50] + scenario[20][51] + scenario[20][52] + scenario[20][53] + scenario[20][54] + scenario[20][55] +
			scenario[20][56]);

		System.out.println(
			scenario[21][0] + scenario[21][1] + scenario[21][2] + scenario[21][3] + scenario[21][4] + scenario[21][5] + scenario[21][6] +
			scenario[21][7] + scenario[21][8] + scenario[21][9] + scenario[21][10] + scenario[21][11] + scenario[21][12] + scenario[21][13] +
			scenario[21][14] + scenario[21][15] + scenario[21][16] + scenario[21][17] + scenario[21][18] + scenario[21][19] + scenario[21][20] +
			scenario[21][21] + scenario[21][22] + scenario[21][23] + scenario[21][24] + scenario[21][25] + scenario[21][26] + scenario[21][27] +
			scenario[21][28] + scenario[21][29] + scenario[21][30] + scenario[21][31] + scenario[21][32] + scenario[21][33] + scenario[21][34] +
			scenario[21][35] + scenario[21][36] + scenario[21][37] + scenario[21][38] + scenario[21][39] + scenario[21][40] + scenario[21][41] +
			scenario[21][42] + scenario[21][43] + scenario[21][44] + scenario[21][45] + scenario[21][46] + scenario[21][47] + scenario[21][48] +
			scenario[21][49] + scenario[21][50] + scenario[21][51] + scenario[21][52] + scenario[21][53] + scenario[21][54] + scenario[21][55] +
			scenario[21][56]);

		System.out.println(
			scenario[22][0] + scenario[22][1] + scenario[22][2] + scenario[22][3] + scenario[22][4] + scenario[22][5] + scenario[22][6] +
			scenario[22][7] + scenario[22][8] + scenario[22][9] + scenario[22][10] + scenario[22][11] + scenario[22][12] + scenario[22][13] +
			scenario[22][14] + scenario[22][15] + scenario[22][16] + scenario[22][17] + scenario[22][18] + scenario[22][19] + scenario[22][20] +
			scenario[22][21] + scenario[22][22] + scenario[22][23] + scenario[22][24] + scenario[22][25] + scenario[22][26] + scenario[22][27] +
			scenario[22][28] + scenario[22][29] + scenario[22][30] + scenario[22][31] + scenario[22][32] + scenario[22][33] + scenario[22][34] +
			scenario[22][35] + scenario[22][36] + scenario[22][37] + scenario[22][38] + scenario[22][39] + scenario[22][40] + scenario[22][41] +
			scenario[22][42] + scenario[22][43] + scenario[22][44] + scenario[22][45] + scenario[22][46] + scenario[22][47] + scenario[22][48] +
			scenario[22][49] + scenario[22][50] + scenario[22][51] + scenario[22][52] + scenario[22][53] + scenario[22][54] + scenario[22][55] +
			scenario[22][56]);

		System.out.println(
			scenario[23][0] + scenario[23][1] + scenario[23][2] + scenario[23][3] + scenario[23][4] + scenario[23][5] + scenario[23][6] +
			scenario[23][7] + scenario[23][8] + scenario[23][9] + scenario[23][10] + scenario[23][11] + scenario[23][12] + scenario[23][13] +
			scenario[23][14] + scenario[23][15] + scenario[23][16] + scenario[23][17] + scenario[23][18] + scenario[23][19] + scenario[23][20] +
			scenario[23][21] + scenario[23][22] + scenario[23][23] + scenario[23][24] + scenario[23][25] + scenario[23][26] + scenario[23][27] +
			scenario[23][28] + scenario[23][29] + scenario[23][30] + scenario[23][31] + scenario[23][32] + scenario[23][33] + scenario[23][34] +
			scenario[23][35] + scenario[23][36] + scenario[23][37] + scenario[23][38] + scenario[23][39] + scenario[23][40] + scenario[23][41] +
			scenario[23][42] + scenario[23][43] + scenario[23][44] + scenario[23][45] + scenario[23][46] + scenario[23][47] + scenario[23][48] +
			scenario[23][49] + scenario[23][50] + scenario[23][51] + scenario[23][52] + scenario[23][53] + scenario[23][54] + scenario[23][55] +
			scenario[23][56]);

		System.out.println(
			scenario[24][0] + scenario[24][1] + scenario[24][2] + scenario[24][3] + scenario[24][4] + scenario[24][5] + scenario[24][6] +
			scenario[24][7] + scenario[24][8] + scenario[24][9] + scenario[24][10] + scenario[24][11] + scenario[24][12] + scenario[24][13] +
			scenario[24][14] + scenario[24][15] + scenario[24][16] + scenario[24][17] + scenario[24][18] + scenario[24][19] + scenario[24][20] +
			scenario[24][21] + scenario[24][22] + scenario[24][23] + scenario[24][24] + scenario[24][25] + scenario[24][26] + scenario[24][27] +
			scenario[24][28] + scenario[24][29] + scenario[24][30] + scenario[24][31] + scenario[24][32] + scenario[24][33] + scenario[24][34] +
			scenario[24][35] + scenario[24][36] + scenario[24][37] + scenario[24][38] + scenario[24][39] + scenario[24][40] + scenario[24][41] +
			scenario[24][42] + scenario[24][43] + scenario[24][44] + scenario[24][45] + scenario[24][46] + scenario[24][47] + scenario[24][48] +
			scenario[24][49] + scenario[24][50] + scenario[24][51] + scenario[24][52] + scenario[24][53] + scenario[24][54] + scenario[24][55] +
			scenario[24][56]);

		System.out.println(
			scenario[25][0] + scenario[25][1] + scenario[25][2] + scenario[25][3] + scenario[25][4] + scenario[25][5] + scenario[25][6] +
			scenario[25][7] + scenario[25][8] + scenario[25][9] + scenario[25][10] + scenario[25][11] + scenario[25][12] + scenario[25][13] +
			scenario[25][14] + scenario[25][15] + scenario[25][16] + scenario[25][17] + scenario[25][18] + scenario[25][19] + scenario[25][20] +
			scenario[25][21] + scenario[25][22] + scenario[25][23] + scenario[25][24] + scenario[25][25] + scenario[25][26] + scenario[25][27] +
			scenario[25][28] + scenario[25][29] + scenario[25][30] + scenario[25][31] + scenario[25][32] + scenario[25][33] + scenario[25][34] +
			scenario[25][35] + scenario[25][36] + scenario[25][37] + scenario[25][38] + scenario[25][39] + scenario[25][40] + scenario[25][41] +
			scenario[25][42] + scenario[25][43] + scenario[25][44] + scenario[25][45] + scenario[25][46] + scenario[25][47] + scenario[25][48] +
			scenario[25][49] + scenario[25][50] + scenario[25][51] + scenario[25][52] + scenario[25][53] + scenario[25][54] + scenario[25][55] +
			scenario[25][56]);

		System.out.println(
			scenario[26][0] + scenario[26][1] + scenario[26][2] + scenario[26][3] + scenario[26][4] + scenario[26][5] + scenario[26][6] +
			scenario[26][7] + scenario[26][8] + scenario[26][9] + scenario[26][10] + scenario[26][11] + scenario[26][12] + scenario[26][13] +
			scenario[26][14] + scenario[26][15] + scenario[26][16] + scenario[26][17] + scenario[26][18] + scenario[26][19] + scenario[26][20] +
			scenario[26][21] + scenario[26][22] + scenario[26][23] + scenario[26][24] + scenario[26][25] + scenario[26][26] + scenario[26][27] +
			scenario[26][28] + scenario[26][29] + scenario[26][30] + scenario[26][31] + scenario[26][32] + scenario[26][33] + scenario[26][34] +
			scenario[26][35] + scenario[26][36] + scenario[26][37] + scenario[26][38] + scenario[26][39] + scenario[26][40] + scenario[26][41] +
			scenario[26][42] + scenario[26][43] + scenario[26][44] + scenario[26][45] + scenario[26][46] + scenario[26][47] + scenario[26][48] +
			scenario[26][49] + scenario[26][50] + scenario[26][51] + scenario[26][52] + scenario[26][53] + scenario[26][54] + scenario[26][55] +
			scenario[26][56]);

		System.out.println(
			scenario[27][0] + scenario[27][1] + scenario[27][2] + scenario[27][3] + scenario[27][4] + scenario[27][5] + scenario[27][6] +
			scenario[27][7] + scenario[27][8] + scenario[27][9] + scenario[27][10] + scenario[27][11] + scenario[27][12] + scenario[27][13] +
			scenario[27][14] + scenario[27][15] + scenario[27][16] + scenario[27][17] + scenario[27][18] + scenario[27][19] + scenario[27][20] +
			scenario[27][21] + scenario[27][22] + scenario[27][23] + scenario[27][24] + scenario[27][25] + scenario[27][26] + scenario[27][27] +
			scenario[27][28] + scenario[27][29] + scenario[27][30] + scenario[27][31] + scenario[27][32] + scenario[27][33] + scenario[27][34] +
			scenario[27][35] + scenario[27][36] + scenario[27][37] + scenario[27][38] + scenario[27][39] + scenario[27][40] + scenario[27][41] +
			scenario[27][42] + scenario[27][43] + scenario[27][44] + scenario[27][45] + scenario[27][46] + scenario[27][47] + scenario[27][48] +
			scenario[27][49] + scenario[27][50] + scenario[27][51] + scenario[27][52] + scenario[27][53] + scenario[27][54] + scenario[27][55] +
			scenario[27][56]);

		System.out.println(
			scenario[28][0] + scenario[28][1] + scenario[28][2] + scenario[28][3] + scenario[28][4] + scenario[28][5] + scenario[28][6] +
			scenario[28][7] + scenario[28][8] + scenario[28][9] + scenario[28][10] + scenario[28][11] + scenario[28][12] + scenario[28][13] +
			scenario[28][14] + scenario[28][15] + scenario[28][16] + scenario[28][17] + scenario[28][18] + scenario[28][19] + scenario[28][20] +
			scenario[28][21] + scenario[28][22] + scenario[28][23] + scenario[28][24] + scenario[28][25] + scenario[28][26] + scenario[28][27] +
			scenario[28][28] + scenario[28][29] + scenario[28][30] + scenario[28][31] + scenario[28][32] + scenario[28][33] + scenario[28][34] +
			scenario[28][35] + scenario[28][36] + scenario[28][37] + scenario[28][38] + scenario[28][39] + scenario[28][40] + scenario[28][41] +
			scenario[28][42] + scenario[28][43] + scenario[28][44] + scenario[28][45] + scenario[28][46] + scenario[28][47] + scenario[28][48] +
			scenario[28][49] + scenario[28][50] + scenario[28][51] + scenario[28][52] + scenario[28][53] + scenario[28][54] + scenario[28][55] +
			scenario[28][56]);

		System.out.println(
			scenario[29][0] + scenario[29][1] + scenario[29][2] + scenario[29][3] + scenario[29][4] + scenario[29][5] + scenario[29][6] +
			scenario[29][7] + scenario[29][8] + scenario[29][9] + scenario[29][10] + scenario[29][11] + scenario[29][12] + scenario[29][13] +
			scenario[29][14] + scenario[29][15] + scenario[29][16] + scenario[29][17] + scenario[29][18] + scenario[29][19] + scenario[29][20] +
			scenario[29][21] + scenario[29][22] + scenario[29][23] + scenario[29][24] + scenario[29][25] + scenario[29][26] + scenario[29][27] +
			scenario[29][28] + scenario[29][29] + scenario[29][30] + scenario[29][31] + scenario[29][32] + scenario[29][33] + scenario[29][34] +
			scenario[29][35] + scenario[29][36] + scenario[29][37] + scenario[29][38] + scenario[29][39] + scenario[29][40] + scenario[29][41] +
			scenario[29][42] + scenario[29][43] + scenario[29][44] + scenario[29][45] + scenario[29][46] + scenario[29][47] + scenario[29][48] +
			scenario[29][49] + scenario[29][50] + scenario[29][51] + scenario[29][52] + scenario[29][53] + scenario[29][54] + scenario[29][55] +
			scenario[29][56]);

		System.out.println(
			scenario[30][0] + scenario[30][1] + scenario[30][2] + scenario[30][3] + scenario[30][4] + scenario[30][5] + scenario[30][6] +
			scenario[30][7] + scenario[30][8] + scenario[30][9] + scenario[30][10] + scenario[30][11] + scenario[30][12] + scenario[30][13] +
			scenario[30][14] + scenario[30][15] + scenario[30][16] + scenario[30][17] + scenario[30][18] + scenario[30][19] + scenario[30][20] +
			scenario[30][21] + scenario[30][22] + scenario[30][23] + scenario[30][24] + scenario[30][25] + scenario[30][26] + scenario[30][27] +
			scenario[30][28] + scenario[30][29] + scenario[30][30] + scenario[30][31] + scenario[30][32] + scenario[30][33] + scenario[30][34] +
			scenario[30][35] + scenario[30][36] + scenario[30][37] + scenario[30][38] + scenario[30][39] + scenario[30][40] + scenario[30][41] +
			scenario[30][42] + scenario[30][43] + scenario[30][44] + scenario[30][45] + scenario[30][46] + scenario[30][47] + scenario[30][48] +
			scenario[30][49] + scenario[30][50] + scenario[30][51] + scenario[30][52] + scenario[30][53] + scenario[30][54] + scenario[30][55] +
			scenario[30][56]);

	}

	public void run(){

		scenario[ball.getY()][ball.getX()] = ball.getFormat();

		scenario[player1.getY()][player1.getX()] = Character.toString(player1.getFormat().charAt(0));
		scenario[player1.getY()][player1.getX() + 1] = Character.toString(player1.getFormat().charAt(1));
		scenario[player1.getY()][player1.getX() + 2] = Character.toString(player1.getFormat().charAt(2));
		scenario[player1.getY()][player1.getX() + 3] = Character.toString(player1.getFormat().charAt(3));
		scenario[player1.getY()][player1.getX() + 4] = Character.toString(player1.getFormat().charAt(4));
		scenario[player1.getY()][player1.getX() + 5] = Character.toString(player1.getFormat().charAt(5));
		scenario[player1.getY()][player1.getX() + 6] = Character.toString(player1.getFormat().charAt(6));
		scenario[player1.getY()][player1.getX() + 7] = Character.toString(player1.getFormat().charAt(7));
		scenario[player1.getY()][player1.getX() + 8] = Character.toString(player1.getFormat().charAt(8));
		scenario[player1.getY()][player1.getX() + 9] = Character.toString(player1.getFormat().charAt(9));
		scenario[player1.getY()][player1.getX() + 10] = Character.toString(player1.getFormat().charAt(10));

		scenario[player2.getY()][player2.getX()] = Character.toString(player2.getFormat().charAt(0));
		scenario[player2.getY()][player2.getX() + 1] = Character.toString(player2.getFormat().charAt(1));
		scenario[player2.getY()][player2.getX() + 2] = Character.toString(player2.getFormat().charAt(2));
		scenario[player2.getY()][player2.getX() + 3] = Character.toString(player2.getFormat().charAt(3));
		scenario[player2.getY()][player2.getX() + 4] = Character.toString(player2.getFormat().charAt(4));
		scenario[player2.getY()][player2.getX() + 5] = Character.toString(player2.getFormat().charAt(5));
		scenario[player2.getY()][player2.getX() + 6] = Character.toString(player2.getFormat().charAt(6));
		scenario[player2.getY()][player2.getX() + 7] = Character.toString(player2.getFormat().charAt(7));
		scenario[player2.getY()][player2.getX() + 8] = Character.toString(player2.getFormat().charAt(8));
		scenario[player2.getY()][player2.getX() + 9] = Character.toString(player2.getFormat().charAt(9));
		scenario[player2.getY()][player2.getX() + 10] = Character.toString(player2.getFormat().charAt(10));

		try {

			while(ball.getX() != 56){

				drawScenario();
				scenario[ball.getY()][ball.getX()] = " ";
				ball.setX(ball.getX() + 1);
				scenario[ball.getY()][ball.getX()] = ball.getFormat();
				Thread.sleep(100);

			}

		}catch(Exception e){

			System.out.println(e.getMessage());

		}

	}

}

