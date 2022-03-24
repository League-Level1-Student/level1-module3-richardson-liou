int x = 0;
int y = 0;
int width = 800;
int height = 600;
Car car1 = new Car(10,10,50,10);
Car car2 = new Car(20,10,50,10);



void setup(){
  
}

void draw(){
  
  background(171, 220, 255);
  fill(13, 255, 102);
  ellipse(x, y, width, height);
  car1.display();  
  car2.display();
}

void settings(){
  size(width, height);    
}



void keyPressed()
{
    if(key == CODED){
        if(keyCode == UP)
        {
            y-=1;
        }
        else if(keyCode == DOWN)
        {
            y +=1;
        }
        else if(keyCode == RIGHT)
        {
            x +=1;
        }
        else if(keyCode == LEFT)
        {
            x-=1;
        }
    }
}

void keepIn(){
  if(x > width){
      x = width;
  }
  if (y > height){
    y = height;
  }
}


class Car{
  int x;
  int y;
  int size;
  int speed;

    Car(int x, int y, int size, int speed){
      this.x = x;
      this.y = y;
      this.size = size;
      this.speed = speed;
    }
    
    void moveLeft(){
     x -=speed;
     
    }
    void display()
  {
    fill(0,255,0);
    rect(x , y,  size, 50);
  }
  
}
