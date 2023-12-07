CREATE TABLE "User" (
   "id" serial NOT NULL UNIQUE,
   "login" VARCHAR(255) NOT NULL UNIQUE,
   "password" VARCHAR(255) NOT NULL,
   "email" VARCHAR(255) NOT NULL UNIQUE,
   "name" VARCHAR(255) NOT NULL,
   "surname" VARCHAR(255) NOT NULL,
   "patronymic" VARCHAR(255),
   CONSTRAINT "User_pk" PRIMARY KEY ("id")
) WITH (
      OIDS=FALSE
);


CREATE TABLE "Customer" (
	"id" serial NOT NULL UNIQUE,
	"user_id" integer NOT NULL,
	"age" integer NOT NULL,
	CONSTRAINT "Customer_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);

CREATE TABLE "Account" (
	"id" serial NOT NULL,
	"currency_name" VARCHAR(255) NOT NULL,
	"amount" FLOAT NOT NULL,
	"overdraft_amount" FLOAT NOT NULL,
	"customer_id" integer NOT NULL,
	"account_number" integer NOT NULL UNIQUE,
	CONSTRAINT "account_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "Customer" ADD CONSTRAINT "Customer_fk0" FOREIGN KEY ("user_id") REFERENCES "User"("id");

ALTER TABLE "Account" ADD CONSTRAINT "account_fk0" FOREIGN KEY ("customer_id") REFERENCES "Customer"("id");

alter table "Account"
    add is_blocked boolean default false;




