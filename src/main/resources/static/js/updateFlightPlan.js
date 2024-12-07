async function updateFlightPlan() {
    const response = await fetch("/api/plans")

    if (!response.ok) {
        alert("Error")
    } else {
        await response.json().then(data => intoList(data))
    }

    function intoList(data) {
        const tableRows = document.getElementById("flightPlanList")
        tableRows.innerHTML = ""
        data.forEach(({routeId, aircraftId, departureAirport, arrivalAirport, routeLength, departureTime, arrivalTime, flightPlan}) => {
            const row = document.createElement("li")
            row.innerHTML = `${routeId}. <strong>ID ВС:</strong> ${aircraftId}, <strong>Аэропорт отправления:</strong> ${departureAirport}, <strong>Аэропорт прибытия:</strong> ${arrivalAirport}, <strong>Длина маршрута:</strong> ${routeLength}, <strong>Время отправления:</strong> ${departureTime}, <strong>Время прибытия:</strong> ${arrivalTime}, <strong>План полёта:</strong> ${flightPlan}`
            tableRows.append(row)
        });
    }
}