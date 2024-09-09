import React from 'react';
import { State } from 'country-state-city';

const StateDropdown = ({ country, selectedStateId, onStateChange }) => {
    const states = State.getAllStates().filter(state => state.countryCode === country);

    return (
        <select
            value={selectedStateId}
            onChange={(e) => onStateChange(e.target.value)}
        >
            <option value="">Select State</option>
            {states.map(state => (
                <option key={state.isoCode} value={state.isoCode}>
                    {state.name}
                </option>
            ))}
        </select>
    );
};

export default StateDropdown;
