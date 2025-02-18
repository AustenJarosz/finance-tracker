const API_BASE_URL = "http://localhost:8080/api/v1/transaction";  // Updated to match backend

export async function fetchTransactions() {
    const response = await fetch(API_BASE_URL);  // No need for /transactions since it's already included in the mapping
    if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
    }
    return response.json();
}
