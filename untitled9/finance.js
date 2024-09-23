let operations = [];
let amounts = [];
let descriptions = [];

function addTransaction(type, amount, description) {
    operations.push(type);
    amounts.push(amount);
    descriptions.push(description);
    console.log(`Операцію "${type}" на суму ${amount} додано: ${description}`);
}

function viewBalance() {
    let balance = 0;
    for (let i = 0; i < amounts.length; i++) {
        balance += operations[i] === 'income' ? amounts[i] : -amounts[i];
    }
    console.log(`Поточний баланс: ${balance}`);
    return balance;
}

function viewHistory() {
    if (operations.length === 0) {
        console.log("Історія транзакцій порожня.");
        return;
    }
    console.log("Історія транзакцій:");
    for (let i = 0; i < operations.length; i++) {
        console.log(`${i + 1}. ${operations[i]}: ${amounts[i]} (${descriptions[i]})`);
    }
}

addTransaction('income', 5000, 'Зарплата');
addTransaction('expense', 1500, 'Комунальні платежі');
viewBalance();
viewHistory();
