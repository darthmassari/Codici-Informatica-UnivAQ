* Esercizio A (6 punti)
* Si scriva un programma con le seguenti caratteristiche:
*   ° La procedura principale del programma esegue le seguenti azioni:
*     ° Chiama la procedura f con parametro 10 e memorizza il risultato nella variabile R1
*     ° Chiama la procedura f con parametro 15 e memorizza il risultato nella variabile R2
*   ° La procedura f deve calcolare, in modo ricorsivo, il risultato della funzione matematica f(x),
*     che ha un parametro intero e produce un risultato intero, definita come segue(gli operatori
*     presenti nella definizione hanno lo stesso significato che in C Standard):
*     ° f(x) = 1                                        se x <= 0
*     ° f(x) = 3 * x - f( x / 7 ) + 2 * f( x / 5 )      se x > 0
 
* Si devono scrivere ed inviare 3 versioni del programma, che soddisfino i seguenti requisiti:
*   2  Versione ASM MC68000-ASM in cui:
*     - gli interi sono memorizzati in parole di formato word
*     - parametri e risultato sono passati attraverso lo stack


* Versione C
*   int f ( int x ) {
*     if( x <= 0 )
*       return 1;
*     return 3 * x - f( x / 7 ) + 2 * f( x / 5 );
*   }
*   
*   int r1, r2;
*   
*   int main ( void ) {
*     r1 = f( 10 );
*     r2 = f( 15 );
*   
*     return 0;
*   }


* Versione M68k-ASM1
  org $4000
r1: dc.w 0
r2: dc.w 0

  org $2000
main_start:
  move.w #10, d0
  move.w d0, -(sp)
  bsr f
  move.w (sp)+, d0
  move.w d0, r1

  move.w #15, d0
  move.w d0, -(sp)
  bsr f
  move.w (sp)+, r1

main_end:
  bra code_end

f:
  move.w (sp)+, d0
  tst d0
  ble if_f_1

  move.w d0, d1
  move.w d0, d2
  muls #3, d0
  divs #7, d1
  move.w d1, -(sp)
  bsr f

  move.w (sp)+, d1
  sub.w d1, d0
  move.w d2, -(sp)
  bsr f

  move.w (sp)+, d2
  muls #2, d2 
  
  add.w d0, d2
  move.w d2, -(sp)
  rts

if_f_1:
  move.w #1, d0
  move.w d0, -(sp)
  rts

code_end:
  end