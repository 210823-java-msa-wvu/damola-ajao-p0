drop table "Playlist" ;
drop table "Login_Info" ;
drop table "Platform_Availability" ;
drop table "Songs";


create table "Songs"
(
	"SongId" INT not NULL,
	"Title" varchar not Null,
	"Artist" varchar not null,
	"Genre" varchar not null,
	"Release Date" date not null,
	 CONSTRAINT "PK_Song" PRIMARY KEY  ("SongId")
	);

create table "Login_Info"(
	"UserId" INT not null,
	"Username" varchar not null,
	"Password" varchar not null,
	"Uploader" boolean not null,
	CONSTRAINT "PK_User" PRIMARY KEY  ("UserId")
	);
	
create table "Playlist"(
	"PlaylistId" INT not null,
	"UserId" INT not null,
	"Playlist Title" varchar not null,
	"SongId" INT not null,
	CONSTRAINT "PK_Playlist" PRIMARY KEY  ("PlaylistId")
	
);


create table "Platform_Availability"(
	"PlatformId" Int not null,
	"SongId" INT not NULL,
	"iTunes" boolean not null,
	"Play Store" boolean not null,
	"Soundcloud" boolean not null,
	"Spotify" boolean not null,
	"Youtube rip" boolean not null,
	CONSTRAINT "PK_Platform" PRIMARY KEY  ("PlatformId")
	);


   
ALTER TABLE "Platform_Availability" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("SongId") REFERENCES "Songs" ("SongId") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "Playlist" ADD CONSTRAINT "FK_UserId"
    FOREIGN KEY ("UserId") REFERENCES "Login_Info" ("UserId") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "Playlist" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("SongId") REFERENCES "Songs" ("SongId") ON DELETE NO ACTION ON UPDATE NO ACTION;   
   
   
 /*Songs to add
  * 1.That snail house milk song
  * 2.Raven off soundcloud
  * 3.Sinatra songs
  * 4.Pokemon song
  * 5.Radiant Emerald: Diamond In The Sky
  * 6.Radical City: Living In The City
  * 7.Sonic song
  * 8.Myths you forgot kamelia
  * 9.xi - apoptosis
  * 10. Ryo Nakamura - Loading
  * 11. Necessary Discrepancy
  * 12. Super Sonic Racing
  * 13. Venus <Another Phase Mix>
  * 14. Topaz Tatsh
  * 15. Endless Possibilities
  * 
  *   Songs to add
  */
   select*from "Songs";
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (1, N'Hot Milk','Snail''s House', 'Electronic', '11-17-2016');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (2, N' STRATEGY','RAVENWORKS', 'Symphonic/Orchestral Jazz', '09-07-2013');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (3, N'Fly Me To The Moon','Frank Sinatra', 'Jazz', '04-01-1954');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (4, N'Pokemon Silver/Gold/Crystal - Surf Theme','Junichi Masuda, Go Ichinose, Morikazu Aoki', 'Soundtrack', '11-21-1999');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (5, N'Radiant Emerald: Diamond In The Sky','
Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (6, N'Radical City: Living In The City','Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (7, N'Myths You Forgot','Camellia', 'Hard Techno', '07-11-2021');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (8, N'FM Synthesis Experiment','Camellia', 'Electronic', '12-30-2018');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (9, N'MEGANTO METEOR','Camellia', 'Electronic', '07-16-2016');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (10, N'Loading','Ryo Nakamura', 'Electronic', '04-24-2021');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (11, N'Necessary Discrepancy','Daisuke Ishiwatari', 'Rock', '06-08-2021');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (12, N'Super Sonic Racing','Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (13, N'Topaz ','Tatsh', 'Electronic', '10-27-2011');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (14, N'Venus <Another Phase Mix>','Tatsh', 'Electronic', '10-27-2011');
INSERT INTO "Songs" ("SongId" , "Title", "Artist" ,"Genre", "Release Date") VALUES (15, N'Get Busy Living','Gold Fish', 'Electronic', '09-20-2010');

select*from "Platform_Availability";
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (1,1,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (2,2,false,false,true,false,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (3,3,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (4,4,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (5,5,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (6,6,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (7,7,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (8,8,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (9,9,false,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (10,10,false,false,true,false,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (11,11,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (12,12,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (13,13,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (14,14,true,true,true,true,true);
INSERT INTO "Platform_Availability" ("PlatformId" , "SongId", "iTunes" ,"Play Store", "Soundcloud", "Spotify", "Youtube rip") values (15,15,true,true,true,true,true);

select * from "Login_Info";
INSERT INTO "Login_Info" ("UserId", "Username", "Password", "Uploader") values (1,'JazzMan92', 'Rockisrolling',false);
INSERT INTO "Login_Info" ("UserId", "Username", "Password", "Uploader") values (2,'SupahSonic23', 'blueisBest',false);
INSERT INTO "Login_Info" ("UserId", "Username", "Password", "Uploader") values (3,'ModAuthority', 'whenindoubtrip',true);

INSERT INTO "Playlist" ("PlaylistId" , "UserId" , "Playlist Title" , "SongId") values (3,'ModAuthority', 'whenindoubtrip',true);


