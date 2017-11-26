import Robot;

public class RobotAdapter implements Spieler {

	Robot roboter;

	RobotAdapter(Robot test) {
		this.roboter = test;
	}

	public int geheNachUnten(int distanz) {
		int y = (int) Robot.getY() - distanz;
		Robot.rolleNach(Robot.getX(), y);
		return Robot.getY();
	}

	public int geheNachOben(int distanz) {

		int y = (int) Robot.getY() + distanz;
		Robot.rolleNach(Robot.getX(), y);
		return Robot.getY();
	}

	public int geheNachLinks(int distanz) {
		int x = (int) Robot.getX() - distanz;
		Robot.rolleNach(x, Robot.getY());
		return Robot.getX();
	}

	public int geheNachRechts(int distanz) {
		int x = (int) Robot.getX() + distanz;
		Robot.rolleNach(x, Robot.getY());
		return Robot.getX();
	}
}