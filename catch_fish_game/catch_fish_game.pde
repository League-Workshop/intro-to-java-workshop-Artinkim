void setup()
{
size(600,800); 
}
int ballY; 
int ballX = (int) random(400);
int score;
int hs;
int b = 50;
int radius = 40;
int c;
int m;

void draw()
{
drawFish();
fill(20,0,100);
noStroke();
ellipse(ballX,ballY,20,20);
ballY += 1*score+1;
checkCatch();
hs();
drawScore();
}


void checkCatch()
{
if(dist(ballX,mouseX,radius) && dist(ballY,mouseY,radius)&& mouseY >=b)
{
score ++; 
c ++;
ballY = 0;
ballX = (int) random(400);
ellipse(ballX,ballY,20,20);
}
else if (ballY >= 800 && score > 0)
{
score --;
m ++;
ballY = 0;
ballX = (int) random(400);
ellipse(ballX,ballY,20,20);
  
}

}


void drawFish(){
  background(141,233,237);
  if(mouseY >=b)
  {
  noStroke();
  fill(255,255,255);
  ellipse(mouseX-17,mouseY-17,20,20); //back side eye
  fill(255,200,88);
  ellipse(mouseX,mouseY,90,50); //body
  triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
  stroke(0);
  triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
  noStroke();
  fill(255,200,88);
  ellipse(mouseX,mouseY,15,15); //side fin cover
  noStroke();
  fill(255,255,255);
  ellipse(mouseX-25,mouseY-15,20,20); //front eye
  fill(0,0,0);
  ellipse(mouseX-25,mouseY-15,5,5); //pupil
  fill(141,233,237);
  ellipse(mouseX-45,mouseY,25,25); //mouth
}
}


public boolean dist(int a, int b, int c) 
{
    return Math.abs(a - b) < c;
}


public void hs()
{
if(score > hs)
{
hs = score;
}
}

public void drawScore()
{
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
text("High Score: " + hs, 20, 50);  
text("Collected: " + c, 20, 100);
text("Missed: " + m, 20, 150);
}

  