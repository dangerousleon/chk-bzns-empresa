CREATE TABLE public.enterprise(
    id serial PRIMARY KEY,
	code uuid UNIQUE,
	name_enterprise varchar NOT NULL,
	rfc varchar NULL,
	address varchar NULL,
	phone varchar NOT NULL,
	email varchar NOT NULL,
	state varchar NOT NULL,
	image varchar NULL,
	legal_representative varchar NOT NULL,
	created TIMESTAMP NOT NULL DEFAULT now(),
	updated timestamp NULL,
	country varchar NOT NULL
);


