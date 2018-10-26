/*Paulo Roberto Nunes da Rosa*/
DIGITO	[0-9]
LETRA	[a-zA-Z]
ID	{LETRA}({LETRA}|{DIGITO})*
OP [&&|<|+|-|*]	
COMENTARIO ([/"*"]{LETRA}*["*"/]|[//])

%%
{DIGITO}+		{printf("Inteiro: %s\n",yytext);}
{DIGITO}+"."{DIGITO}+	{printf("Real: %s\n",yytext);} 
{ID}			{printf("var: %s\n",yytext);}
{OP}	{printf("Operador Binario: %s\n",yytext);}
{COMENTARIO} {printf("Comentario: %s\n", yytext);}
%%
int yywrap();

main(){
  yylex();
}

int yywrap(){
 return 1;
}
