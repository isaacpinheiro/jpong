public class App {

	public static void main(String args[]){

		Components ball = new Components();
		ball.setFormat("*");
		ball.setX(29);
		ball.setY(15);

		Components player1 = new Components();
		player1.setFormat("===========");
		player1.setX(24);
		player1.setY(26);

		Components player2 = new Components();
		player2.setFormat("===========");
		player2.setX(24);
		player2.setY(6);

		Scenario scenario = new Scenario();
		scenario.setBall(ball);
		scenario.setPlayer1(player1);
		scenario.setPlayer2(player2);

		Thread game = new Thread(scenario);
		game.start();

	}

}

