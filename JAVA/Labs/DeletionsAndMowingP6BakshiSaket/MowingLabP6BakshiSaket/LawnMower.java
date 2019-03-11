/* Saket Bakshi. AP Computer Science A. Mowing. Due March 10, 2019.
This class solves the Mowing problem.
*/
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Point;

public class LawnMower
{
	private ArrayList<Point> horizontalBorders; //makes the lawn for the array
	private ArrayList<Point> verticalBorders;
	private String[][] lawn;
	private Rectangle mower; //makes object for the mower
	private static int counter;
	
	/**
		Creates a LawnMower object. This class has a mower, a lawn, and methods to create the lawn, move the mower, return info about the whole object, cut the lawn, and detect the surroundings of the mower.
		@param xPosition the x-coordinate position of the middle of the mower
		@param yPosition the y-coordinate position of the middle of the mower
		@param lawn the two-dimensional String array to show if the lawn is cut, where the trees are, and where the mower is
		@param length the vertical dimension of the lawn
		@param width the horizontal dimension of the lawn
	*/
	public LawnMower(int xPosition, int yPosition, String[][] lawn, int length, int width)
	{
		horizontalBorders = new ArrayList<>();
		verticalBorders = new ArrayList<>();
		this.lawn = lawn;
		mower = new Rectangle(xPosition, yPosition, 3, 3);
		makeTopBottomBorders(length, width);
		makeRightLeftBorders(length, width);
		counter = 0;
	}
	
	/**
		Returns the top and bottom borders of the lawn
		@return the arraylist for the top and bottom borders of the lawn
	*/
	public ArrayList<Point> getTopBottomBorders() {return horizontalBorders;}
	
	/**
		Returns the left and right borders of the lawn
		@return the arraylist for the left and right borders of the lawn
	*/
	public ArrayList<Point> getRightLeftBorders() {return verticalBorders;}
	
	/**
		Creates the top and bottom borders of the lawn
	*/
	private void makeTopBottomBorders(int length, int width)
	{
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(i == 0)
				{
					Point p = new Point(j, i+1);
					horizontalBorders.add(p);
				}
				if(i == length - 1)
				{
					Point p = new Point(j, i-1);
					horizontalBorders.add(p);
				}
			}
		}
	}
	
	/**
		Creates the right and left borders of the lawn
	*/
	private void makeRightLeftBorders(int length, int width)
	{
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(j == 0)
				{
					Point p = new Point(j+1, i);
					verticalBorders.add(p);
				}
				if(j == width - 1)
				{
					Point p = new Point(j-1, i);
					verticalBorders.add(p);
				}
			}
		}
	}
	
	/**
		Sets the location of the mower using integers as x and y coordinates
	*/
	public void setLocation(int x, int y) {mower.setLocation(x, y);}
	
	/**
		Sets the location of the mower using Points for x and y coordinates
	*/
	public void setLocation(Point p) {mower.setLocation(p);}
	
	/**
		Moves the mower one space down
	*/
	public void moveDown() {mower.translate(0, 1);}
	
	/**
		Moves the mower one space up
	*/
	public void moveUp() {mower.translate(0, -1);}
	/**
		Moves the mower one space to the right
	*/
	public void moveRight() {mower.translate(1, 0);}
	
	/**
		Moves the mower one space to the left
	*/
	public void moveLeft() {mower.translate(-1,0);}
	
	/**
		Returns the Rectangle object's data of the mower
		@return the information of the Rectangle object of the mower
	*/	
	public Rectangle getMower() {return mower;}
	
	/**
		Returns the location of the mower
		@return the location of the mower
	*/
	public Point getLocation() {return mower.getLocation();}
	
	/**
		Returns the two-dimensional String array of the lawn
		@return a 2D array of the lawn
	*/
	public String[][] getLawn() {return lawn;}
	
	/**
		Changes the area around the mower to cut grass
	*/
	public void cut()
	{
		lawn[(int)mower.getY()][(int)mower.getX()] = "C";
		lawn[(int)mower.getY()+1][(int)mower.getX()] = "C";
		lawn[(int)mower.getY()-1][(int)mower.getX()] = "C";
		lawn[(int)mower.getY()][(int)mower.getX()-1] = "C";
		lawn[(int)mower.getY()+1][(int)mower.getX()-1] = "C";
		lawn[(int)mower.getY()-1][(int)mower.getX()-1] = "C";
		lawn[(int)mower.getY()][(int)mower.getX()+1] = "C";
		lawn[(int)mower.getY()-1][(int)mower.getX()+1] = "C";
		lawn[(int)mower.getY()+1][(int)mower.getX()+1] = "C";
	}
	
	/**
		Returns true if the mower is at the top or bottom border
		@return if the mower is at the border
	*/
	public boolean atTopBottomBorder()
	{
		for(int i = 0; i < horizontalBorders.size(); i++)
		{
			if(mower.getLocation().equals(horizontalBorders.get(i)))
			{
				return true;
			}
		}
		return false;
	}

	/**
		Returns true if the mower is at the left or right border
		@return if the mower is at the border
	*/	
	public boolean atRightLeftBorder()
	{
		for(int i = 0; i < verticalBorders.size(); i++)
		{
			if(mower.getLocation().equals(verticalBorders.get(i)))
			{
				return true;
			}
		}
		return false;
	}

	/**
		Returns true if the mower is at the bottom border
		@return if the mower is at the bottom border
	*/
	public boolean atBottomBorder() {return (int)mower.getLocation().getY() == lawn.length - 2;}
	
	/**
		Returns true if the mower is at the top border
		@return if the mower is at the top border
	*/
	public boolean atTopBorder() {return (int)mower.getLocation().getY() == 1;}
	
	/**
		Returns true if the mower is at the right border
		@return if the mower is at the right border
	*/
	public boolean atRightBorder() {return (int)mower.getLocation().getX() == lawn[0].length - 2;}
	
	/**
		Returns true if the mower is at the left border
		@return if the mower is at the left border
	*/
	public boolean atLeftBorder() {return (int)mower.getLocation().getX() == 1;}
	
	/**
		Returns true if a tree is above the mower
		@return if there is a tree above
	*/
	public boolean treeAbove()
	{
		if(atTopBorder())
		{
			return false;
		}
		if(lawn[(int)mower.getY()-2][(int)mower.getX()].equals("T"))
		{
			return true;
		}
		if(lawn[(int)mower.getY()-2][(int)mower.getX()+1].equals("T"))
		{
			return true;
		}
		if(lawn[(int)mower.getY()-2][(int)mower.getX()-1].equals("T"))
		{
			return true;
		}
		return false;
	}
	
	/**
		Returns true if a tree is below the mower
		@return if there is a tree below
	*/
	public boolean treeBelow()
	{
		if(atBottomBorder())
		{
			return false;
		}
		if(lawn[(int)mower.getY()+2][(int)mower.getX()].equals("T"))
		{
			return true;
		}
		if(lawn[(int)mower.getY()+2][(int)mower.getX()+1].equals("T"))
		{
			return true;
		}
		if(lawn[(int)mower.getY()+2][(int)mower.getX()-1].equals("T"))
		{
			return true;
		}
		return false;
	}
	
	/**
		Moves the mower up as long as nothing is in the way or there is no border
	*/
	public void toTheTop()
	{
		while(true)
		{
			if(atTopBorder())
			{
				break;
			}
			if(treeAbove())
			{
				break;
			}
			else
			{
				moveUp();
			}
		}
	}
	
	/**
		Checks if right side is open to mow
		@return if the right is open to mow
	*/
	public boolean rightIsOpen()
	{
		if(atRightBorder()) //checks for borders
		{
			return false;
		}
		if(lawn[(int)mower.getY()][(int)mower.getX()+2].equals("T")) //checks for trees
		{
			return false;
		}
		if(lawn[(int)mower.getY()+1][(int)mower.getX()+2].equals("T"))
		{
			return false;
		}
		if(lawn[(int)mower.getY()-1][(int)mower.getX()+2].equals("T"))
		{
			return false;
		}
		return true;
	}
	
	/**
		Checks if left side is open to mow
		@return if the left is open to mow
	*/
	public boolean leftIsOpen()
	{
		if(atLeftBorder()) //checks for border
		{
			return false;
		}
		if(lawn[(int)mower.getY()][(int)mower.getX()-2].equals("T")) //checks for trees
		{
			return false;
		}
		if(lawn[(int)mower.getY()+1][(int)mower.getX()-2].equals("T"))
		{
			return false;
		}
		if(lawn[(int)mower.getY()-1][(int)mower.getX()-2].equals("T"))
		{
			return false;
		}
		return true;
	}
	
	/**
		Moves mower up until the right is open
	*/
	public void checkRightToTheTop(Point temp)
	{
		if(!rightIsOpen())
		{
			while(!atTopBorder() && !(mower.getLocation().equals(temp)))
			{
				if(rightIsOpen())
				{
					mower.translate(1, 0);
					break;
				}
				else
				{
					moveUp();
				}
			}
		}
		else
		{
			mower.translate(1, 0);
		}
	}
	
	/**
		Moves mower down until the right is open
	*/
	public void checkRightToTheBottom(Point temp)
	{
		if(!rightIsOpen())
		{
			while(!atBottomBorder() && !(mower.getLocation().equals(temp)))
			{
				if(rightIsOpen())
				{
					mower.translate(1, 0);
					break;
				}
				else
				{
					moveDown();
				}
			}
		}
		else
		{
			mower.translate(1, 0);
		}
	}
	
	/**
		Moves mower up until the left is open.
	*/
	public void checkLeftToTheTop(Point temp)
	{
		if(!leftIsOpen())
		{
			while(!atTopBorder() && !(mower.getLocation().equals(temp))) //nottop
			{
				if(leftIsOpen())
				{
					mower.translate(-1, 0);
					break;
				}
				else
				{
					moveUp();
				}
			}
		}
		else
		{
			mower.translate(-1, 0);
		}
	}
	
	/**
		Moves mower down until the left is open.
	*/
	public void checkLeftToTheBottom(Point temp)
	{
		if(!leftIsOpen())
		{
			while(!atBottomBorder() && !(mower.getLocation().equals(temp))) //nottop
			{
				if(leftIsOpen())
				{
					mower.translate(-1, 0);
					break;
				}
				else
				{
					moveDown();
				}
			}
		}
		else
		{
			mower.translate(-1, 0);
		}
	}
	
	/**
		Fills in a section of the lawn according to a top-right corner coordinate and a rectangular area to fill
	*/
	public void fillSection(int i, int j, String[][] section)
	{
		for(int a = 0; a < section.length; a++)
		{
			for(int b = 0; b < section[0].length; b++)
			{
				section[a][b] = lawn[a+i][b+j];
			}
		}
	}
	
	/**
		Checks to see if a section has either a tree or hasn't been mowed
		@return if the section can be mowed
	*/
	public boolean onlyC(String[][] section)
	{
		for(int i = 0; i < section.length; i++)
		{
			for(int j = 0; j < section[0].length; j++)
			{
				if(section[i][j].equals(".") || section[i][j].equals("T"))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
		Scans to find what sections can be mowed
		@return the point of an area that can be mowed
	*/
	public Point scan()
	{
		int countingTo = counter;
		Point p = new Point(-1, -1);
		String[][] section = new String[3][3];
		for(int i = 0; i < lawn.length-2; i++)
		{
			for(int j = 0; j < lawn[0].length-2; j++)
			{
				fillSection(i, j, section);
				if(onlyC(section))
				{
					if(countingTo == 0)
					{
						Point x = new Point(j+1, i+1);
						counter++;
						return x;
					}
					else
					{
						countingTo--;
					}
				}
			}
		}
		return p;
	}
}