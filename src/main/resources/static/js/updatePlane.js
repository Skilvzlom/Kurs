
async function getPlanes(){
    const response = await fetch('/api/plans/aircraft')

    if (!response.ok) {
        alert("Error with getting aircraft list")
    } else {
        await response.json().then(data => intoList(data))
    }

    function intoList(data) {
        const tableRows = document.getElementById("aircraftPlanType")
        const tableBase = document.getElementById("aircraftBase")
        tableRows.innerHTML = "";
        tableBase.innerHTML = "";
        data.forEach(({aircraftId, aircraftType, aircraftRegistration, maxTakeoffWeight, maxCruiseSpeed, aircraftCapacity}) => {
            console.log(aircraftRegistration, aircraftType, aircraftId)
            const row = document.createElement("option")
            const row2 = document.createElement("ul")
            row2.innerHTML = `${aircraftId}. <strong>Тип:</strong> ${aircraftType}, <strong>Регистрация:</strong> ${aircraftRegistration}, <strong>Максимальная взлетная масса:</strong> ${maxTakeoffWeight}, <strong> Максимальная скорость:</strong> ${maxCruiseSpeed}, <strong>Вместимость:</strong> ${aircraftCapacity}`
            row.innerHTML = `ID : ${aircraftId}, Тип: ${aircraftType}, Регистрация: ${aircraftRegistration}`
            row.setAttribute("value", aircraftId)
            tableRows.append(row);
            tableBase.append(row2);
        });
    }
}