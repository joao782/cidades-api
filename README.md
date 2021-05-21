Url da lista de todos os países: http://localhost:8080/paises

Url da lista de todas as cidades: http://localhost:8080/cidades

Url da lista de todos os estados: http://localhost:8080/estados

Como mostrado no tutorial é possível também passar alguns parâmetros em algumas urls, exemplo http://localhost:8080/cidades?size=5 ou http://localhost:8080/cidades?sort=name,desc.

Urls para calcular distâncias: 1ª opção http://localhost:8080/distancias/by-cube?from=x&to=y

2ª 1ª opção http://localhost:8080/distancias/by-points?from=x&to=y

x e y -> inteiros

======== Informações técnicas

Para que meu código não fosse uma simples cópia do código mostrado no vídeo decidi alterar o nome de algumas classes e interfaces, eu simplesmente traduzi alguns termos do inglês para o português, então a classe Country no meu projeto é Pais (sem acento), TypePoint é TipoPonto, CityRepository é RepositorioCidades e assim por diante.

Além dos nomes das classes e interfaces traduzi também uma grande parte das variáveis, exemplo, City.location será Cidade.localizacao, State.name é Estado.nome etc.

O nome do banco de dados onde ficam as tabelas dos países, estados e cidades é simplesmente 'teste'. Não é um nome muito bom mas julguei que já seria o suficiente.

OBS.: o banco de dados não foi enviado neste commit, para testar a aplicação será necessário recriá-lo.
Nome do usúario do banco de dados: postgres
Senha: 123

Senha muito simples, pois é apenas um projeto de teste.
