
:-dynamic here/1.
:-dynamic location/2.
:-dynamic have/1.
:-dynamic drop/1.
:-dynamic turned_off/1.
:-dynamic turned_on/1.
:-dynamic closed/2.
:-dynamic opened/2.
:-dynamic breakable/1.




room(cochera).
room(recibidor).
room(baño1).
room(sala).
room(antecomedor).
room(comedor).
room(cocina).
room(pasillo).
room(lavanderia).
room(baño2).
room(escaleras).
room(pasillo2).
room(cuarto1).
room(baño3).
room(cuarto2).
room(baño4).
room(cuarto5paty).
room(baño5).
room(cuarto6).
room(baño6).

location(linterna,cocina).
location(mesa,antecomedor).
location(silla1,antecomedor).
location(silla2,antecomedor).
location(silla3,antecomedor).
location(silla4,antecomedor).
location(silla5,antecomedor).
location(silla6,antecomedor).
location(silla7,antecomedor).
location(silla8,antecomedor).
location(silla9,antecomedor).
location(silla10,antecomedor).
location(sillon1,sala).
location(sillon2,sala).
location(sillon3,sala).
location(silla1,comedor).
location(silla2,comedor).
location(silla3,comedor).
location(silla4,comedor).
location(silla5,comedor).
location(silla6,comedor).
location(estufa,cocina).
location(refri,cocina).
location(micro,cocina).
location(lavadora,pasillo).
location(toilet,baño).
location(lavado,baño).
location(toilet2,baño2).
location(lavado2,baño2).
location(toilet3,baño3).
location(lavado3,baño3).
location(toilet4,baño4).
location(lavado4,baño4).
location(toilet5,bañopaty).
location(lavado5,bañopaty).
location(toilet6,baño6).
location(lavado6,baño6).
location(cama1,cuarto1).
location(cama2,cuarto2).
location(camapaty,cuartopaty).
location(cama4,cuarto4).
location(cereal,cocina).
location(nopal,cocina).


door(cochera,recibidor).
door(recibidor,comedor).
door(comedor,cocina).
door(comedor,pasillo).
door(pasillo,lavandera).
door(pasillo2,cuarto1).
door(cuarto1,baño3).
door(pasillo2,cuarto2).
door(cuarto2,baño4).
door(pasillo2,cuartopaty).
door(cuarto3,bañopaty).
door(pasillo2,cuarto4).
door(cuarto4,baño4).

object(mesa,brown,big,50).
object(carro,white,big,200).
object(silla,brown,small,15).
object(sillon1,beige,big,45).
object(sillon2,beige,big,50).
object(sillon3,beige,big,100).
object(refri,white,big,90).
object(estufa,black,big,50).
object(micro,white,big,30).
object(manzana,red,small,2).
object(cereal,brown,small,5).
object(nopal,green,small,5).
object(lavadora,white,big,100).
object(escritorio,brown,big,80).
object(toilet,white,small,30).
object(lavado,white,small,20).
object(toilet2,beige,small,30).
object(lavado2,beige,small,20).
object(toilet3,yellow,small,30).
object(lavado3,yellow,small,30).
object(toilet4,green,small,30).
object(lavado4,green,small,20).
object(toilet5,pink,small,30).
object(lavado5,pink,small,20).
object(toilet6,beige,small,30).
object(lavado6,beige,big,100).
object(lavado3,yellow,small,20).
object(camapaty,white,big,50).

location_s(object(mesa,brown,big,50),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(silla,green,big,15),comedor).
location_s(object(sillon1,beige,big,45),sala).
location_s(object(sillon2,beige,big,50),sala).
location_s(object(sillon3,beige,big,100),sala).
location_s(object(refri,white,big,90),cocina).
location_s(object(estufa,black,big,50),cocina).
location_s(object(micro,white,big,30),cocina).
location_s(object(manzana,red,small,2),cocina).
location_s(object(cereal,brown,small,5),cocina).
location_s(object(nopal,green,small,5),cocina).
location_s(object(lavadora,white,big,100),lavanderia).
location_s(object(toilet,white,small,30),baño).
location_s(object(lavado,white,small,20),baño).
location_s(object(toilet2,beige,small,30),baño2).
location_s(object(lavado2,beige,small,20),baño2).
location_s(object(toilet3,yellow,small,30),baño3).
location_s(object(lavado3,yellow,small,20),baño3).
location_s(object(toilet4,green,small,30),baño4).
location_s(object(lavado4,green,small,20),baño4).
location_s(object(toilet5,pink,small,30),baño5).
location_s(object(lavado5,pink,small,20),baño5).
location_s(object(toilet6,beige,small,30),baño6).
location_s(object(lavado6,beige,small,20),baño6).
location_s(object(camapaty,white,big,100),cuartopaty).


loc_list([mesa,silla1,silla2,silla3,silla4,silla5,silla6],comedor).
loc_list([sillon1,sillon2,sillon3],sala).
loc_list([refri,micro,estufa,manzana,cereal,nopal],cocina).
loc_list([lavadora],lavanderia).
loc_list([toilet,lavado],bano).
loc_list([toilet2,lavado2],bano2).
loc_list([toilet3,lavado3],bano3).
loc_list([toilet,lavado4],baño4).
loc_list([toilet,lavado5],baño5).
loc_list([camapaty],cuartopaty).
loc_list([toilet,lavado6],baño).



edible(cereal).
edible(galletas).


drinkable(agua).


breakable(linterna).

tastes_yucky(nopal).

here(cocina).


turned_off(linterna).
turned_off(cocina).
turned_off(recibidor).
turned_off(antecomedor).
turned_off(cuartopaty).
turned_off(cochera).
turned_off(pasillo2).
turned_off(comedor).

turned_on(refrigerador).
turned_on(cuarto1).
turned_on(baño1).



opened(cuarto).
opened('antecomedor', cocina).
opened(cocina, 'pasillo').
opened('antesala', 'cuarto de atras').

closed('puerta Entrada').
closed(cochera,sala).
closed(pasillo,lavanderia).
closed('patio principal', 'sala principal').
closed(cocina, 'cuarto paty').

closed(cochera,sala).
closed(pasillo,lavanderia).
always_open(sala,comedor).
always_open(comedor,cocina).
always_open(comedor,pasillo).
always_open(pasillo,oficina).
always_open(pasillo,escaleras).
always_open(lavanderia,baño).
always_open(escaleras,pasillo2).
always_open(pasillo2,cuarto1).
always_open(cuarto1,baño3).
always_open(pasillo2,cuarto2).
always_open(pasillo2,cuarto3).
always_open(pasillo2,baño2).
always_open(pasillo2,cuartopaty).
always_open(pasillo2,cuarto5).



where_food(X,Y):-
location(X,Y),
edible(X).
where_food(X,Y):-
location(X,Y),
tastes_yucky(X).


connect(X,Y):-
door(X,Y).
connect(X,Y):-
door(Y,X).

list_things(Room):-
location(X,Room),
write(X),
tab(2),
nl,
fail.
list_things(_).

list_connections(Room) :-
connect(Room,X),
tab(2),
write(X),
nl,
fail.
list_connections(_).

list_things1:-
here(X),
list_things(X).

list_things(Room):-
is_contained_in(X,Room),
write(X),
tab(2),
nl,
fail.
list_things(_).



look :-
here(Room),
write('Estas en '),
write(Room),
nl,
write('Puedes ver'),
nl,
list_things(Room),
write('puedes ir a'),
nl,

list_connections(Room).

look_s :-
here(Room),
write('tu estas en: '),
write(Room),
nl,
write('tu puedes ver:'),
nl,
list_things_s(Room),
write(':'),
nl,
list_connections(Room).

list_things_s(Room):-
location_s(object(Nombre,Color, Size, Weight),Room),
write(Nombre),
tab(2),
write(Color),
tab(2),
write(Size),
tab(2),
write(Weight),
tab(2),
nl,
fail.
list_things_s(_).

list_things_s(Room):-
loc_list(L,Room),
member(X,L),
tab(2),write("-"),
write(X),
nl,
fail.
list_things_s(_).

move(Room):-
retract(here(_)),
asserta(here(Room)).
can_go(Room) :-
here(X),
check_op(X,Room),
connect(X,Room).
can_go(Room) :-
 here(X),
check_al(X,Room),
 connect(X,Room).
can_go(_) :-
write('Door closed, try open it'),
nl,
fail.

take(Object):-
can_take(Object),
take_object(Object).

can_take(Object):-
here(Room),
location(Object,Room).
can_take(Object):-
write('no hay '),
write(Object),
write(' aqui'),
fail.
take_object(Object):-
here(Room),
retract(location(Object,Room)),
asserta(have(Object)),
write(' tomado').

can_take_from(Object,Room):-
here(room),
location(Object,Room),
location(Room,room).
can_take_from(Object,_):-
write('no hay '),
write(Object),
write(' aqui'),
fail.
take_object_from(Object,Room1):-
retract(location(Object,Room1)),
asserta(have(Object)),
write(' tomado').

take_from(Object,Room):-
can_take_from(Object,Room),
take_object_from(Object,Room).


can_put(Object):-
have(Object).
can_put(Object):-
write('No tienes '),
write(Object),
write(' tomado'),
fail.

put_object(Object):-
here(cocina),
retract(have(Object)),
asserta(location(Object,room)),
write(' dejado').
putX(Object):-
can_put(Object),
put_object(Object).

can_put_in(Object,Room):-
here(cocina),
location(Room,room),
have(Object).
can_put_in(Object,_):-
not(have(Object)),
write('No tienes '),
write(Object),
!,
fail.
can_put_in(_,Room):-
here(room),
write('No hay '),
write(Room),
write(' en '),
write(room),
fail.

put_object_in(Object,Room):-
asserta(location(Object,Room)),
retract(have(Object)).
put_in(Object,Room):-
can_put_in(Object,Room),
put_Object_in(Object,Room).

inventory(X):-
have(X),
tab(2),
write(X),
nl,
fail.
inventory(_).

inventory_s :-
have_s(X,_,_,_),
write(X),
nl,
fail.


drop(Object):-
can_drop(Object),
drop_object(Object).
can_drop(Object):-
not(breakable(Object)),
!,
putX(Object).
can_drop(Object):-
breakable(Object),
have(Object).

can_drop(Object):-
not(have(Object)),
write('dont have this').
drop_object(Object):-
retract(have(Object)),
write('breakable').

drop(Object):-
can_drop(Object),
drop_object(Object),
write("soltaste "),
write(Object).

can_drop(Object):-
have(Object).
can_drop(_):-
write("no lo tienes"),
nl,
fail.
drop_object(Object):-
here(X),
retract(have(Object)),
asserta(location(Object,X)).


can_eat(Object):-
have(Object),
edible(Object).
can_eat(Object):-
have(Object),
write('no se puede comer'),
fail.
can_eat(Object):-
not(have(Object)),
write('no tienes '),
write(Object).
eat_object(Object):-
retract(have(Object)).
eat(Object):-
can_eat(Object),
eat_object(Object).

%comer las cosas%
eat(Thing) :-
have(Thing),
edible(Thing),
write('You have eated'),
nl,
write(Thing),
retract(have(Thing)).
eat(Thing) :-
have(Thing),
write(Thing),
write( ' is not edible').
eat(Thing) :-
write(Thing),
write( ' is not in your inventory').



turn_on:-
have(linterna),
turned_off(linterna),
retract(turned_off(linterna)),
asserta(turned_on(linterna)),
write('La linterna esta encendida').
turn_on:-
have(linterna),
write('Ya esta encendida'),
fail.
turn_on:-
not(have(linterna)),
here(room),
turned_off(room),
retract(turned_off(room)),
asserta(turned_on(room)),
write('El cuarto se ha encendido'),
!,
fail.
turn_on:-
not(have(linterna)),
here(room),
turned_on(room),
write('Ya esta encendida'),
fail.


turn_off:-
have(linterna),
turned_on(lampara),
retract(turned_on(lampara));
assert(turned_off(lampara)),
write('la linterna esta apagada').
turn_off:-
have(linterna),
write('la linterna estaba apagada').
turn_off:-
not(have(linterna)),
here(Room),
turned_on(Room),
retract(turned_on(Room)),
assert(turned_off(Room)),
write('el cuarto ya esta  apagado').
turn_off:-
not(have(linterna)),
here(Room),
turned_off(Room),
write('el cuarto estaba apagado').


check_open(Room2):-
here(Room1),
open(Room1,Room2).
check_open(_):-
write('Esta cerrada').

check_closed(Room2):-
here(Room1),
closed(Room1,Room2).
check_closed(_):-
write('Esta abierta').

check_op(X,Y) :- opened(X,Y).
check_op(X,Y) :- opened(Y,X).
check_cl(X,Y) :- closed(X,Y).
check_cl(X,Y) :- closed(Y,X).
check_al(X,Y) :- always_open(X,Y).
check_al(X,Y) :- always_open(Y,X).

cl(X,Y) :- retract(closed(X,Y)).
cl(X,Y) :- retract(closed(Y,X)).
clop(X,Y) :- retract(opened(X,Y)).
clop(X,Y) :- retract(opened(Y,X)).
op(X,Y) :- assert(opened(X,Y)).
op(X,Y) :- assert(opened(X,Y)).

open(Room2):-
here(Room1),
connect(Room1,Room2),
opened(Room1,Room2),
write('Siempre esta abierta').
open(Room2):-
here(Room1),
connect(Room1,Room2),
check_closed(Room2),
!,
retract(closed(Room1,Room2)),
asserta(open(Room1,Room2)),
write('Se abrio').
open(_):-
write('No existe la puerta').


closened(Room2):-
here(Room1),
connect(Room1,Room2),
open(Room1,Room2),
write('Siempre esta abierta').
closened(Room2):-
here(Room1),
connect(Room1,Room2),
check_open(Room2),
!,
retract(open(Room1,Room2)),
asserta(closed(Room1,Room2)),
write('Se cerro').
closened(_):-
write('No existe la puerta').

open_door(Room) :-
here(X),
cl(X,Room),
op(X,Room).
open_door(_) :-
here(_),
write('You can''t open that door'),
nl,
write('is not here').
close_door(Room) :-
here(X),
clop(X,Room).
%recursivo%
is_contained_in(T1,T2):-
location(T1,T2).

is_contained_in(T1,T2):-
location(X,T2),
is_contained_in(T1,X).

can_take(Thing) :-
 here(Place),
 is_contained_in(Thing,Place).

can_take(Thing) :-
 write('There is no'),
 write(Thing),
 write('here.'),
 nl,
 fail.

take_object(X) :-
is_contained_in(X,Y),
retract(location(X,Y)),
assert(have(X)),
write('taken'),
nl.

take(X) :-
can_take(X),
take_object(X).

take_Object(X):-
is_contained_in(X,Y),
retract(location(X,Y)),
assert(have(X)),
write('taken'),
nl.


%take con estructura%
take_s(X) :-
can_take_s(X),
take_object_s(X).

can_take_s(Thing) :-
here(Room),
location_s(object(Thing,_,small,_),Room).
can_take_s(Thing) :-
here(Place),
location_s(object(Thing,_,big,_),Place),
write('The '),
write(Thing),
write(' is too big to carry.'),
nl,
fail.
can_take_s(Thing) :-
here(Room),
not(location_s(object(Thing,_,_,_),Room)),
write('There is no '),
write(Thing),
write(' here.'),
nl,
fail.
take_object_s(X) :-
retract(location_s(object(X,A,B,C),_)),
assert(have_s(X,A,B,C)),
write('taken'),
nl.




%tomar objetos de listas%
take_s(Thing):-
can_take_list(Thing),
take_object_list(Thing).

can_take_list(Thing):-
here(Room),
loc_list(L,Room),
member(Thing,L).
can_take_list(_):-
write('There is no object'),
fail.

take_object_list(Thing):-
here(Room),
loc_list(L,Room),
remove(Thing,L,NL),
retract(loc_list(L,Room)),
asserta(loc_list(NL,Room)),
asserta(have(Thing)),
write('taken').




colocate(Thing) :-
have(Thing),
retract(have(Thing)),
assert(location(Thing,_)),
write('Object colocated'),
nl.
colocate(Thing) :-
write(Thing),
write(' is not in your inventory').
colocate(Thing,Place) :-
have(Thing),
retract(have(Thing)),
assert(location(Thing,Place)),
write('Object colocated').

colocate_s(Thing) :-
have_s(Thing,A,B,C),
retract(have_s(Thing,_,_,_)),
assert(location_s(object(Thing,A,B,C),_)),
write('Object colocated'),
nl.
colocate_s(Thing) :-
write(Thing),
write(' is not in your inventory').
colocate_s(Thing,Place) :-
have_s(Thing,A,B,C),
retract(have_s(Thing,_,_,_)),
assert(location_s(object(Thing,A,B,C),Place)),
write('Object colocated'),
nl.


member(H,[H|_]).
member(X,[_|T]) :-
member(X,T).

recu(X,Y) :-
loc_list(List,Y),
member(X,List).

append([],X,X).
append([H|T1],X,[H|T2]) :-
append(T1,X,T2).

location_new(X,Y) :-
loc_list(List,Y),
member(X,List).


add_thing(NewThing, Container, NewList) :-
loc_list(OldList,Container),
append([NewThing],OldList,NewList).

add_thing2(NewThing, Container, NewList) :-
loc_list(OldList, Container),
NewList = [NewThing | OldList].

add_thing3(NewThing, Container, [NewThing|OldList]):-
loc_list(OldList,Container).


put_thing(Thing,Room) :-
retract(loc_list(List,Room)),
assert(loc_list([Thing|List],Room)).

recu_list(Thing, [Thing|Lista], Lista).
recu_list(Thing, [Aux|Lista1], [Aux|Lista2]):-
recu_list(Thing, Lista1, Lista2).

take_thing(Thing,Room) :-
retract(loc_list(List,Room)),
recu_list(Thing,List,Y),
assert(have(Thing)),
assert(loc_list(Y,Room)).







