drop table "playlist" ;
drop table "login_info" ;
drop table "platform_availability" ;
drop table "songs";


create table "songs"
(
	"songid" serial not NULL,
	"title" varchar not Null,
	"artist" varchar not null,
	"genre" varchar not null,
	 CONSTRAINT "PK_Song" PRIMARY KEY  ("songid")
	);

create table "login_info"(
	"userid" serial not null,
	"username" varchar not null,
	"password" varchar not null,
	"uploader" boolean not null,
	CONSTRAINT "PK_User" PRIMARY KEY  ("userid")
	);
	
create table "playlist"(
	"playlistid" serial not null,
	"userid" INT not null,
	"playlistname" varchar not null,
	"songid" INT not null,
	CONSTRAINT "PK_Playlist" PRIMARY KEY  ("playlistid")
	
);


create table "platform_availability"(
	"platformid" serial not null,
	"songid" INT not NULL,
	"itunes" boolean not null,
	"youtube_music" boolean not null,
	"soundcloud" boolean not null,
	"spotify" boolean not null,
	"youtube_rip" boolean not null,
	CONSTRAINT "PK_Platform" PRIMARY KEY  ("platformid")
	);


   
ALTER TABLE "platform_availability" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("songid") REFERENCES "songs" ("songid") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "playlist" ADD CONSTRAINT "FK_UserId"
    FOREIGN KEY ("userid") REFERENCES "login_info" ("userid") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "playlist" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("songid") REFERENCES "songs" ("songid") ON DELETE NO ACTION ON UPDATE NO ACTION;   
   
   
 /*songs to add
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
  *   songs to add
  */
   select*from "songs";
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Hot Milk','Snail''s House', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N' STRATEGY','RAVENWORKS', 'Symphonic/Orchestral Jazz');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Fly Me To The Moon','Frank Sinatra', 'Jazz');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Pokemon Silver/Gold/Crystal - Surf Theme','Junichi Masuda, Go Ichinose, Morikazu Aoki', 'Soundtrack');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Radiant Emerald: Diamond In The Sky','
Richard Jacques', 'Pop');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Radical City: Living In The City','Richard Jacques', 'Pop');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Myths You Forgot','Camellia', 'Hard Techno');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'FM Synthesis Experiment','Camellia', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'MEGANTO METEOR','Camellia', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Loading','Ryo Nakamura', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Necessary Discrepancy','Daisuke Ishiwatari', 'Rock');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Super Sonic Racing','Richard Jacques', 'Pop');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Topaz ','Tatsh', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Venus <Another Phase Mix>','Tatsh', 'Electronic');
INSERT INTO "songs" ( "title", "artist" ,"genre") VALUES (N'Get Busy Living','Gold Fish', 'Electronic');

select*from "platform_availability";
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (1,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (2,false,false,true,false,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (3,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (4,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (5,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (6,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (7,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (8,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (9,false,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (10,false,false,true,false,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (11,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (12,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (13,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (14,true,true,true,true,true);
INSERT INTO "platform_availability" ("songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (15,true,true,true,true,true);

select * from "login_info";
INSERT INTO "login_info" ( "username", "password", "uploader") values ('jazzman', 'rockisrolling',false);
INSERT INTO "login_info" ( "username", "password", "uploader") values ('supahsonic', 'blueisbest',false);
INSERT INTO "login_info" ( "username", "password", "uploader") values ('ModAuthority', 'whenindoubtrip',true);
INSERT INTO "login_info" ( "username", "password", "uploader") values ('alpha', 'omega',true);
delete from login_info ;

select * from "playlist" where "playlistname" = 'Jazz stuff' ;
select * from playlist;
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 2, 'Racing Tunes', 5 );
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 2, 'Racing Tunes', 6 );
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 2, 'Racing Tunes', 12 );
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 1, 'Jazz stuff', 3 );
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 1, 'Jazz stuff', 2 );
INSERT INTO "playlist" ( "userid" , "playlistname" , "songid") values ( 1, 'Jazz stuff', 15 );
insert into "playlist" ( "userid" , "playlistname" , "songid") values ( 3, 'Tepid', 13 )



select * from musicproject.songs s
inner join musicproject.platform_availability p
on s.songid = p.songid 



