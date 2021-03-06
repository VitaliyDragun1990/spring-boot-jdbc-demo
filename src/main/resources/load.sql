drop table if exists stock;

CREATE TABLE stock (
  stock_id     INT,
  company_name VARCHAR(50),
  symbol       VARCHAR(10),
  price        DECIMAL(10, 2)
);

insert into stock VALUES (1, 'VMWare', 'WMV', 56.05);
insert into stock VALUES (2, 'AT&T', 'T', 38.74);
insert into stock VALUES (3, 'Facebook', 'FB', 118.25);