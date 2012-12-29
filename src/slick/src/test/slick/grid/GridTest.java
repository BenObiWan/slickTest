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
	public void mouseClicked(final int button, final int x, final int y,
			final int clickCount)
	{
		_x = x;
		_y = y;
	}

	public GridTest()
	{
		super("Grid");
	}

	@Override
	public void init(final GameContainer gc) throws SlickException
	{

	}

	@Override
	public void update(final GameContainer gc, final int delta)
			throws SlickException
	{

	}

	@Override
	public void render(final GameContainer gc, final Graphics g)
			throws SlickException
	{
		drawTable(g, _x, _y, 80, 80, 6, 7);
	}

	private void drawTable(final Graphics g, final int iTopLeftX,
			final int iTopLeftY, final int iRowSize, final int iColumnSize,
			final int iRowCount, final int iColumnCount)
	{
		// draw vertical lines
		for (int i = 0; i <= iColumnCount; i++)
		{
			final int iX = iTopLeftX + i * iColumnSize;
			g.drawLine(iX - 1, iTopLeftY, iX - 1, iTopLeftY + iRowCount
					* iRowSize);
			g.drawLine(iX, iTopLeftY, iX, iTopLeftY + iRowCount * iRowSize);
			g.drawLine(iX + 1, iTopLeftY, iX + 1, iTopLeftY + iRowCount
					* iRowSize);
		}
		// draw horizontal lines
		for (int i = 0; i <= iRowCount; i++)
		{
			final int iY = iTopLeftY + i * iRowSize;
			g.drawLine(iTopLeftX, iY - 1, iTopLeftX + iColumnCount
					* iColumnSize, iY - 1);
			g.drawLine(iTopLeftX, iY, iTopLeftX + iColumnCount * iColumnSize,
					iY);
			g.drawLine(iTopLeftX, iY + 1, iTopLeftX + iColumnCount
					* iColumnSize, iY + 1);
		}
	}

	public static void main(final String[] args) throws SlickException
	{
		final AppGameContainer app = new AppGameContainer(new GridTest());

		app.setDisplayMode(800, 600, false);
		app.start();
	}
}
