INSERT INTO address (street, number, complement, district, city, state, state_initials, zip_code, country) VALUES
('Rua das Flores', '123', 'Apto 45', 'Centro', 'São Paulo', 'São Paulo', 'SP', '01000-000', 'Brasil'),
('Avenida Paulista', '1000', '', 'Bela Vista', 'São Paulo', 'São Paulo', 'SP', '01310-000', 'Brasil'),
('Rua da Consolação', '200', '', 'Consolação', 'São Paulo', 'São Paulo', 'SP', '01301-000', 'Brasil'),
('Praça da Sé', '', '', 'Sé', 'São Paulo', 'São Paulo', 'SP', '01001-000', 'Brasil');

INSERT INTO client (name, document, email, address_id) VALUES
('João da Silva', '60352053054', 'joaosilva@email.com', 1),
('Maria Oliveira', '35798272001', 'mariaoliveira@domain.com', 2),
('Carlos Souza', '54977059018', 'carlosouza@domain.com', 3)