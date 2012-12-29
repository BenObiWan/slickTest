package test.slick.grid;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class GridTest extends BasicGame
{
	private int _x = 100;
	private int _y = 100;

	@Override
	public void mouseClicked(int button, int x, int y, int clickCount)
	{
		_x = x;
		_y = y;
	}

	public GridTest()
	{
		super("Grid");
	}

	@Override
	public void init(GameContainer gc) throws SlickException
	{

	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException
	{

	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		drawTable(g, _x, _y, 80, 80, 6, 7);
	}

	private void drawTable(Graphics g, int iTopLeftX, int iTopLeftY,
			int iRowSize, int iColumnSize, int iRowCount, int iColumnCount)
	{
		// draw vertical lines
		for (int i = 0; i <= iColumnCount; i++)
		{
			g.drawLine(iTopLeftX + i * iColumnSize, iTopLeftY, iTopLeftX + i
					* iColumnSize, iTopLeftY + iRowCount * iRowSize);
		}
		// draw horizontal lines
		for (int i = 0; i <= iRowCount; i++)
		{
			g.drawLine(iTopLeftX, iTopLeftY + i * iRowSize, iTopLeftX
					+ iColumnCount * iColumnSize, iTopLeftY + i * iRowSize);
		}
	}

	public static void main(String[] args) throws SlickException
	{
		AppGameContainer app = new AppGameContainer(new GridTest());

		app.setDisplayMode(800, 600, false);
		app.start();
	}
}
