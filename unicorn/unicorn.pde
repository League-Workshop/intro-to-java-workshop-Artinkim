PImage rainbow;
PImage unicorn;
void setup()
{
rainbow = loadImage ("rainbow.png");
unicorn = loadImage ("unicorn.jpeg");
size(1000,1000);
rainbow.resize(1000,1000);
}

void draw()
{
background(rainbow);
image (unicorn,mouseX-40,mouseY-40);
unicorn.resize(100,100);
}