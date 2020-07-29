//Programa para controlar movimiento por medio de bluetooth

#include <Servo.h>                // Incluye la libreria Servo
Servo servo1;                    // Crea el objeto servo1 con las caracteristicas de Servo

int estado = 'c';
int pin_Trig = 3;
int pin_Echo = 2;
double duracion, distancia;
double tiempo;

int izqA = 5; 
int izqB = 6; 
int derA = 9; 
int derB = 10; 
int vel = 255; 

void setup() {
    Serial.begin(9600);
    //pin leds
  pinMode(derA, OUTPUT);
  pinMode(derB, OUTPUT);
  pinMode(izqA, OUTPUT);
  pinMode(izqB, OUTPUT);
    
    //pin sensor ultrasónico
    pinMode(pin_Trig, OUTPUT);
    pinMode(pin_Echo, INPUT);
    
}

void loop() {
  
  if(Serial.available()> 0){ //funcion para verificar si hay datos en el puerto serial
      estado = Serial.read(); //leemos los datos que llegan al puerto serial
  }
    
    if(estado=='a'){           // Boton desplazar al Frente
    analogWrite(derB, 0);     
    analogWrite(izqB, 0); 
    analogWrite(derA, vel);  
    analogWrite(izqA, vel);       
  }
  if(estado=='b'){          // Boton IZQ 
    analogWrite(derB, 0);     
    analogWrite(izqB, 0); 
    analogWrite(derA, 0);  
    analogWrite(izqA, vel);      
  }
  if(estado=='c'){         // Boton Parar
    analogWrite(derB, 0);     
    analogWrite(izqB, 0); 
    analogWrite(derA, 0);    
    analogWrite(izqA, 0); 
  }
  if(estado=='d'){          // Boton DER
    analogWrite(derB, 0);     
    analogWrite(izqB, 0);
    analogWrite(izqA, 0);
    analogWrite(derA, vel);  
  } 

  if(estado=='e'){          // Boton Reversa
    analogWrite(derA, 0);    
    analogWrite(izqA, 0);
    analogWrite(derB, vel);  
    analogWrite(izqB, vel);      
  }
  
  if (estado =='f'){               // Boton ON,  se mueve sensando distancia 
  
     digitalWrite(pin_Trig, HIGH);   // genera el pulso de trigger por 10us
     delay(0.01);
     digitalWrite(pin_Trig, LOW);
     
     duracion = pulseIn(pin_Echo, HIGH);          // Lee el tiempo del Echo
     distancia = (duracion/2) / 29;            // calcula la distancia en centimetros
     delay(10); 
     
     if (distancia <= 15 && distancia >=2){    // si la distancia es menor de 15cm
        digitalWrite(13,HIGH);                 // Enciende LED
        
        analogWrite(derB, 0);             // Parar los motores por 200 mili segundos
        analogWrite(izqB, 0); 
        analogWrite(derA, 0);    
        analogWrite(izqA, 0); 
        delay (200);
        
        analogWrite(derB, vel);          // Reversa durante 500 mili segundos
        analogWrite(izqB, vel); 
        delay(500);           
        
        analogWrite(derB, 0);            // Girar durante 600 milisegundos   
        analogWrite(izqB, 0); 
        analogWrite(derA, 0);  
        analogWrite(izqA, vel);  
        delay(600);
     }
        
    if(estado == 'f'){          //carro automatico(sensor ultrasonico)
        
        //codigo del sensor
        digitalWrite(pin_Trig,HIGH);
        delay(0.01);
        digitalWrite(pin_Trig,LOW);

        duracion = pulseIn(pin_Echo,HIGH);      //valor en microsegundos de ida y vuelta de la onda de sonido
        tiempo = duracion/2;                    //tiempo desde el inicio hasta donde se encuentra el objeto
        distancia = 0.03432*tiempo;             // distancia en cm

        if (distancia <= 15 && distancia >=2){    // si la distancia es menor de 15cm
        digitalWrite(13,HIGH);                 // Enciende LED
        
        analogWrite(derB, 0);             // Parar los motores por 200 mili segundos
        analogWrite(izqB, 0); 
        analogWrite(derA, 0);    
        analogWrite(izqA, 0); 
        delay (200);
        
        analogWrite(derB, vel);          // Reversa durante 500 mili segundos
        analogWrite(izqB, vel); 
        delay(500);           
        
        analogWrite(derB, 0);            // Girar durante 600 milisegundos   
        analogWrite(izqB, 0); 
        analogWrite(derA, 0);  
        analogWrite(izqA, vel);  
        delay(600);
        
     }
     else{                             // Si no hay obstaculos se desplaza al frente  
         analogWrite(derB, 0);     
         analogWrite(izqB, 0); 
         analogWrite(derA, vel);  
         analogWrite(izqA, vel); 
     }

    if(estado == 'g'){
      //para el carro
        Serial.println("Detener carro");
          analogWrite(derB, 0);     
          analogWrite(izqB, 0); 
          analogWrite(derA, 0);    
         analogWrite(izqA, 0); 
    } 
    Serial.println(estado);
      }
   }
}
    
