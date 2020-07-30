%{
#include<stdio.h>
%}
%{ 
int n = 0 ; 
%} 

%% 
@[a-zA-Z]+ {n++;printf("\t Identificador : %s", yytext);} 

"-"|"+"|"/"|"*" {n++;printf("\t Operador aritmetico : %s", yytext);} 

"<"|">"|"<="|">="|"=" {n++;printf("\t Operador relacional : %s", yytext);} 

"&"|"|"|"~" {n++;printf("\t Operador logico : %s", yytext);}

"Program"|"begin"|"end"|"input"|"output"|"integer"|"real"|"char"|"String"|"boolean" {n++;printf("\t Palabra reservada : %s", yytext);} 

"if"|"else"|"then"|"while"|"do"|"repeat"|"until"|"var"|"true"|"false" {n++;printf("\t Palabra reservada : %s", yytext);} 

"("|")"|";"|","|":"|"=" {n++;printf("\t Caracter especial : %s", yytext);} 

"//"[ A-Za-z0-9 ]*"//"  	{n++;printf("\t Comentarios: %s", yytext);} 			 

[0-9]+ {n++;printf("\t Numero entero : %s", yytext);}						 

-[0-9]+ {n++;printf("\t Numero entero : %s", yytext);}	



. ; 
%% 


int main() 

{ 
	
	yylex(); 
	
} 
