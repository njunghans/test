CREATE TABLE Relation.Gueter (
       ID INTEGER NOT NULL generated always as identity
     , Beschreibung VARCHAR(256)
     , CONSTRAINT PK_GUETER PRIMARY KEY (ID)
);

CREATE TABLE Relation.Schlagworte (
       ID INTEGER NOT NULL generated always as identity
     , Name VARCHAR(32) NOT NULL
     , CONSTRAINT PK_SCHLAGWORTE PRIMARY KEY (ID)
);

CREATE TABLE Relation.Gueterschlagworte (
       Gueter_ID INTEGER NOT NULL
     , Schlagworte_ID INTEGER NOT NULL
     , CONSTRAINT PK_GueTERSCHLAGWORTE PRIMARY KEY (Gueter_ID, Schlagworte_ID)
     , CONSTRAINT FK_Gueterschlagworte_1 FOREIGN KEY (Gueter_ID)
                  REFERENCES Relation.Gueter (ID)
     , CONSTRAINT FK_Gueterschlagworte_2 FOREIGN KEY (Schlagworte_ID)
                  REFERENCES Relation.Schlagworte (ID)
);

drop table Relation.Gueterschlagworte;
drop table Relation.Gueter;
drop table Relation.Schlagworte;

insert into "RELATION"."SCHLAGWORTE" ("NAME") values('HihoSchlagwort');
insert into "RELATION"."GUETER" ("BESCHREIBUNG") values('Ein weiteres Gut');
insert into "RELATION"."GUETERSCHLAGWORTE" ("GUETER_ID", "SCHLAGWORTE_ID") values(1, 1);
