import React, { useEffect, useState } from "react";

function Transactions() {
    const [transactions, setTransactions] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/api/v1/transaction")  // Update this if your backend runs on a different port
            .then(response => response.json())
            .then(data => setTransactions(data))
            .catch(error => console.error("Error fetching transactions:", error));
    }, []);

    return (
        <div>
            <h2>Transactions</h2>
            <ul>
                {transactions.map(transaction => (
                    <li key={transaction.id}>
                        {transaction.merchant} - ${transaction.amount} on {transaction.date}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Transactions;
