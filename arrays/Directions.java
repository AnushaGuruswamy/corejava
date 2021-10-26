class Directions{
public static void main(String []args){

char []directions={'L','R','U','D'};
char moove=directions[2];
System.out.println(moove);

directions[2]='B';
char newdirection=directions[2];
System.out.println(newdirection);
}
}