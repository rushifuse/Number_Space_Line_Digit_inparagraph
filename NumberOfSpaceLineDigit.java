class NumberOfSpaceLineDigit
{
public static void main(String args[])
{
	
String str="The average paragraph is about 200 words, but there isn’t a hard and fast rule about how long a paragraph should be. Read on for \new writing tips and techniques about varying paragraph lengths to keep your readers engaged.";
int count=0,chara=0,line=0,space=0;
char ch[]=new char[300];
	for(int i=0;i<str.length();i++)
	{
	ch[i]=str.charAt(i);
		if(Character.isDigit(str.charAt(i)))
		{
			count++;
		}
		else if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' )
		{
			chara++;
		}
		else if(ch[i]=='\n')
		{
			line++;
		}
		else if(ch[i]==' ')
		{
			space++;
		}
	}
System.out.println("digit:-"+count);
System.out.println("Character:-"+chara);
System.out.println("line:-"+line);
System.out.println("space:-"+space);

}}


//output:- 4
