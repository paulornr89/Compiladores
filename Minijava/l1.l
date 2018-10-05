/*	PAULO ROBERTO NUNES DA ROSA
	TRABALHO 2 - COMPILADORES	*/
DIGITO					[0-9]
LETRA					[a-zA-Z]
OP 						("&&"|"<"|"+"|"-"|"*")
ID						{LETRA}({LETRA}|{DIGITO}|_)*
COMENTARIO 				(["/*"]{LETRA}*["*/"]|[//])
PALAVRA_RESERVADA 		(class|public|static|void|main|String|extends)
TIPO 					(int|boolean)
COMANDO 				(if|while|else|System.out.println|=|;)
EXPRESSAO 				(true|false|this|new|!|length)
FIM_ARQUIVO 			[<<EOF>>]
ABRE_CHAVES				("{")
FECHA_CHAVES			("}")
ABRE_PARENTESES			("(")
FECHA_PARENTESES		(")")
%%
{DIGITO}+				{printf("Inteiro: %s\n",yytext);}
{DIGITO}+"."{DIGITO}+	{printf("Real: %s\n",yytext);} 
{PALAVRA_RESERVADA}		{printf("Palavra Reservada: %s\n",yytext);}
{COMANDO}				{printf("Comando: %s\n",yytext);}
{TIPO}					{printf("Tipo: %s\n",yytext);}
{EXPRESSAO}				{printf("Expressao: %s\n",yytext);}
{ID}					{printf("var: %s\n",yytext);}
{OP}					{printf("Operador Binario: %s\n",yytext);}
{COMENTARIO} 			{printf("Comentario: %s\n", yytext);}
{FIM_ARQUIVO} 			{printf("Fim de arquivo: %s\n", yytext);}
{ABRE_CHAVES}			{printf("Abre Chaves: %s\n",yytext);}
{FECHA_CHAVES}			{printf("Fecha Chaves: %s\n",yytext);}
{ABRE_PARENTESES}		{printf("Abre Parenteses: %s\n",yytext);}
{FECHA_PARENTESES}		{printf("Fecha Parenteses: %s\n",yytext);}
%%
int yywrap();

main(){
  yylex();
}

int yywrap(){
 return 1;
}
