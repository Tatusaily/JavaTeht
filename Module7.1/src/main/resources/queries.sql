use converterdb;

select * from currencies;

select * from currencies where abbr = 'EUR';

select count(*) from currencies;

select * from currencies order by rate desc limit 1;
