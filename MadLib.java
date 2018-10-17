package arraylist;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs=new ArrayList<String>() ;
	private ArrayList<String> nouns=new ArrayList<String>();
	private ArrayList<String> adjectives=new ArrayList<String>();
	
	public MadLib()
	{
	}

	public MadLib(String fileName)
	{
		loadNouns();
		loadVerbs();
		loadAdjectives();
		//load stuff
		try{
			Scanner dab=new Scanner(new File(fileName));
			
			String story=" ";
			Scanner print = new Scanner(new File(fileName));
			while(print.hasNextLine())
			{
				String next=print.nextLine();
			for(char ch : next.toCharArray())
			{
				if(ch=='#')
				{
					story+=getRandomNoun();
				}
				else if(ch=='@')
				{
					story+=getRandomVerb();
				}
				else if(ch=='&')
				{
					story+=getRandomAdjective();
				}
				else
				{
					story+=ch;
				}
			}
			}
			story+="\n";
			System.out.println(story);
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
			out.print(e);
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner nun = new Scanner(new File("/Volumes/Siddharth/Haxck/JAVA/Arraylist/src/arraylist/nouns.dat"));
			while(nun. hasNextLine())
			{
				nouns.add(nun.nextLine());
			}
		
		}
		catch(Exception e)
		{
			System.out.println("CS crashed!!!");
			System.out.println(e);
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner verb= new Scanner(new File("/Volumes/Siddharth/Haxck/JAVA/Arraylist/src/arraylist/verbs.dat"));
			while(verb.hasNextLine())
			{
				verbs.add(verb.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("Doesn't work!!!");
			System.out.println(e);
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner adj= new Scanner(new File("/Volumes/Siddharth/Haxck/JAVA/Arraylist/src/arraylist/adjectives.dat"));
			while(adj.hasNextLine())
			{
				adjectives.add(adj.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("Doesn't work!!!");
			System.out.println(e);
		}
	}

	public String getRandomAdjective()
	{
		int adj=(int)(Math.random()*adjectives.size());
		return adjectives.get(adj);
	}
	public String getRandomVerb()
	{
		int ve=(int)(Math.random()*verbs.size());
		return verbs.get(ve);
	}
	public String getRandomNoun()
	{
		int n=(int)(Math.random()*nouns.size());
		return nouns.get(n);
	}
	public String toString()
	{
	   return "\n\n\n";
	}
}