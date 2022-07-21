# Boas vindas ao repositório do desafio da Aceleração Java!

# Descrição do desafio: Sistema de Controle de Acesso

Que sucesso! 👏 Aqui temos um sistema de controle de acesso inteligente para um estabelecimento. Ficou combinado com o cliente que o sistema, ao ser finalizado, deve apresentar um relatório que divida as pessoas que acessaram o estabelecimento em três categorias:

1. Pessoas menores de 18 anos,
2. Pessoas adultas (entre 18 e 49 anos), e
3. Pessoas a partir de 50 anos.

Com esse relatório, o cliente poderá tomar decisões baseadas em informações para alcançar ou fidelizar sua clientela. Esse sistema deve apresentar um menu, no console, indicando a opção de acessar o estabelecimento e a opção de finalizar o sistema e mostrar um relatório. O fluxo do sistema é definido seguindo duas etapas principais que devem ser executadas na seguinte ordem:

1. **Inserir idade de pessoa cliente no sistema:** essa etapa se repete até que a opção de finalizar o sistema seja escolhida. A idade das pessoas clientes deve ser armazenada em um array de tamanho dinâmico, já que não sabemos quantas pessoas clientes chegarão ao estabelecimento.

2. **Finalizar o sistema e mostrar o relatório:** nessa etapa, o laço de repetição deve ser terminado e então o relatório deve ser impresso no console. O relatório deve conter o total de pessoas que acessaram o estabelecimento, e também o número de pessoas menores de 18 anos, o número de pessoas adultas (entre 18 e 49 anos) e o número de pessoas a partir de 50 anos que acessaram o estabelecimento. O relatório também deve calcular, em relação ao total de pessoas, a porcentagem delas que eram menores de 18, que eram adultas (entre 18 e 49), e as a partir de 50.

A imagem abaixo mostra o fluxo que o programa deve seguir:

![SistemaFluxograma](img/controle-acesso.png)

- O menu deve ter o formato:

    ```
    Entre com o número correspondente à opção desejada:
    1 - Acessar o estabelecimento
    2 - Finalizar sistema e mostrar relatório
    ```
Se a pessoa usuária entrar com o valor 1 (que indica que ela quer acessar o estabelecimento), então a mensagem `Entre com a idade:` será impressa no console. Em seguida, depois de inserir a idade da pessoa cliente e pressionar enter, aparecerá uma das mensagens listadas abaixo:

- `Pessoa cliente menor de idade, catraca liberada!`: se a idade da pessoa inserida for menor que 18 anos.

- `Pessoa adulta, catraca liberada!`: se a idade da pessoa inserida for igual ou maior que 18 anos, e menor ou igual a 49 anos.

- `Pessoa adulta a partir de 50, catraca liberada!`: se a idade da pessoa inserida for a partir de 50 anos.

Depois que a mensagem for impressa, então deverá retornar ao estado inicial do menu. Supondo que a idade da primeira pessoa seja 18 anos, um exemplo do conteúdo do console depois de inserir a idade da primeira pessoa cliente será:
```
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostar relatório
1
Entre com a sua idade:
18
Pessoa adulta, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostrar relatório
```
Esse ciclo se repete até a opção 2 ser escolhida, o que indica que a pessoa usuária quer finalizar o expediente e imprimir o relatório.

Depois o relatório é uma parte fundamental do sistema, pois provê informações para que a pessoa proprietária do estabelecimento possa traçar estratégias para aumentar sua clientela e, consequentemente, aumentar seu lucro, gerando mais empregos, impactando a vida de muitas pessoas.

O relatório deve ser impresso no console quando a opção 2 for selecionada. Supondo que 200 pessoas visitaram o estabelecimento, o relatório deve conter as seguintes informações:

- Número total de pessoas que visitaram o estabelecimento: nesse caso, esse valor deverá ser 200.

- Número de pessoas menores de 18 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 20 eram menores de 18 anos, então no relatório esse valor deverá ser 20.

- Número de pessoas adultas (entre 18 e 49 anos) que visitaram o estabelecimento: supondo que, das 200 pessoas, 150 eram adultas entre 18 e 49 anos, então esse valor deverá ser 150.

- Número de pessoas a partir de 50 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 30 tinham a partir de 50, então esse valor deverá ser 30.


O relatório também deve calcular a porcentagem de pessoas em cada categoria em relação ao total de pessoas. Ainda seguindo a suposição anterior, o total de visitas ao estabelecimento foi de 200 pessoas, então o relatório na parte dos números percentuais deve apresentar:

- Percentual de pessoas menores de 18 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 20 eram menores de 18 anos, então no relatório esse valor deverá ser 10.0%.

- Número de pessoas adultas (entre 18 e 49 anos) que visitaram o estabelecimento: supondo que, das 200 pessoas, 150 eram adultas entre 18 e 49 anos, então esse valor deverá ser 75.0%.

- Número de pessoas a partir de 50 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 30 tinham a partir de 50, então esse valor deverá ser 15.0%.

Para essa suposição, a saída do relatório deve ser similar à saída abaixo:
```
----- Quantidade -----
menores: 20
adultas: 150
a partir de 50: 30

----- Percentual -----
menores: 10.0%
adultas: 75.0%
a partir de 50: 15.0%

TOTAL: 200
```

## Restrições

- O valor percentual deve ter duas casas decimais, exceto se for zero, então pode ser apenas uma casa decimal, como exposto no exemplo acima.
- Caso a opção inserida pela pessoa usuária seja um valor diferente de 1 ou de 2, a mensagem `Entre com uma opção válida!` deve ser impressa no console, e o menu voltar para o estado inicial.

---
