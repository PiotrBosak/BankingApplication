create table clients(
   uuid UUID PRIMARY KEY,
   name VARCHAR UNIQUE NOT NULL,
   password VARCHAR NOT NULL,
   address JSONB not null
)

create table banks(
       uuid UUID PRIMARY KEY,
       bankName VARCHAR UNIQUE NOT NULL
)

create table accounts(
       uuid UUID PRIMARY KEY,
       client_id UUID NOT NULL,
       bank_id UUID NOT NULL,
       currency VARCHAR not null ,
       balance FLOAT not null,
       CONSTRAINT client_id_fkey FOREIGN KEY (client_id) REFERENCES clients(uuid)
       MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
       CONSTRAINT bank_id_fkey FOREIGN KEY (bank_id) REFERENCES banks(uuid),
       MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION
)

create table transfers(
       uuid uuid primary key,
       account_to_id UUID NOT NULL,
       account_from_id UUID NOT NULL,
       currency VARCHAR NOT NULL,
       amount FLOAT NOT NULL,
       CONSTRAINT account_to_id_fkey FOREIGN KEY (account_to_id) REFERENCES accounts(uuid),
       MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
       CONSTRAINT account_from_id_fkey FOREIGN KEY (account_from_id) REFERENCES accounts(uuid),
       MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION
)
