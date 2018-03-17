void setup(){
background(20,50,200);
fill(0,0,200);
size(1080,720);
ellipse(500,400,50,100);
fill(0,250,0);
rect(455,330,100,20);
triangle(400,300,450,360,500,240);
}

void draw()
{
rect(50,20,30,100); 
background(0,200,0);
if(mousePressed==true)
{
 fill(250,40,20);
 rect(500,300,30,100);
}
if(mousePressed==false)
{
fill(40,70,200);
rect(500,300,30,100);
}

}

  