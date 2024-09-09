import React, { useEffect, useState } from 'react';
import { City } from 'country-state-city';

const CityDropdown = ({ selectedStateId, selectedCityId, onCityChange }) => {
    const [cities, setCities] = useState([]);

    useEffect(() => {
        if (selectedStateId) {
            const citiesInState = City.getAllCities().filter(city => city.stateCode === selectedStateId);
            setCities(citiesInState);
        } else {
            setCities([]);
        }
    }, [selectedStateId]);

    return (
        <select
            value={selectedCityId}
            onChange={(e) => onCityChange(e.target.value)}
            disabled={!selectedStateId}
        >
            <option value="">Select City</option>
            {cities.map((city, index) => (
                <option key={city.id || index} value={city.id}>
                    {city.name}
                </option>
            ))}
        </select>
    );
};

export default CityDropdown;
