import React, { useState } from 'react';
import axios from 'axios';
import './App.css';
import StateDropdown from './StateDropdown'; 
import CityDropdown from './CityDropdown'; 
import Button from 'react-bootstrap/Button';

const CompanyForm = () => {
    const [formData, setFormData] = useState({
        company_name: '',
        address: '',
        state_id: '',
        city_id: '',
        website: '',
        boardline_number: '',
        industry_vertical_id: '',
        employee_size_id: '',
        turnover_range_id: '',
        server_brand: '',
        number_of_servers: '',
        storage_brand: '',
        type_of_storage: '',
        backup_storage_brand: '',
        erp: '',
        crm: '',
        hrms: '',
        bi_reporting: '',
        cloud: '',
        database_brand: '',
        endpoint: ''
    });

    const [contactData, setContactData] = useState({
        first_name: '',
        last_name: '',
        email_id: '',
        designation: '',
        direct_number: '',
        mobile_number: ''
    });

    const [submitting, setSubmitting] = useState(false);
    const [submittedData, setSubmittedData] = useState(null);
    const [error, setError] = useState(null);

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData((prevData) => ({
            ...prevData,
            [name]: value
        }));
    };

    const handleContactChange = (e) => {
        const { name, value } = e.target;
        setContactData((prevData) => ({
            ...prevData,
            [name]: value
        }));
    };

    const handleStateChange = (state_id) => {
        setFormData((prevData) => ({
            ...prevData,
            state_id
        }));
    };

    const handleCityChange = (city_id) => {
        setFormData((prevData) => ({
            ...prevData,
            city_id
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        setSubmitting(true);

        try {
            const response = await axios.post('http://localhost:7778/api/companies', { ...formData, contact: contactData });
            console.log('Response:', response.data); // Debug: Log the response
            setSubmittedData(response.data);
            handleReset(); 
            alert('Data submitted successfully!');
        } catch (error) {
            console.error('There was an error submitting the data!', error);
            setError('There was an error submitting the data. Please try again.');
        } finally {
            setSubmitting(false);
        }
    };

    const handleReset = () => {
        setFormData({
            company_name: '',
            address: '',
            state_id: '',
            city_id: '',
            website: '',
            boardline_number: '',
            industry_vertical_id: '',
            employee_size_id: '',
            turnover_range_id: '',
            server_brand: '',
            number_of_servers: '',
            storage_brand: '',
            type_of_storage: '',
            backup_storage_brand: '',
            erp: '',
            crm: '',
            hrms: '',
            bi_reporting: '',
            cloud: '',
            database_brand: '',
            endpoint: ''
        });
        setContactData({
            first_name: '',
            last_name: '',
            email_id: '',
            designation: '',
            direct_number: '',
            mobile_number: ''
        });
        setError(null);
    };

    return (
        <div className="container">
            <div className="row">
                <div className="offset-md-3 border rounded p-4 mt-4 shadow">
                    <h2 className="text-center mb-4">Company Details Form</h2>
                    
                    <form onSubmit={handleSubmit}>
                        <fieldset>
                            <legend>Company Details</legend>
                            <div className="form-grid">
                                <div className="form-group">
                                    <label>
                                        <p>Company Name</p>
                                        <input type="text" name="company_name" value={formData.company_name} onChange={handleChange} required />
                                    </label>
                                    <label>
                                        <p>Address</p>
                                        <input type="text" name="address" value={formData.address} onChange={handleChange} required />
                                    </label>
                                    <label>
                                        <p>State</p>
                                        <StateDropdown
                                            country="IN" 
                                            selectedStateId={formData.state_id}
                                            onStateChange={handleStateChange}
                                        />
                                    </label>
                                    <label>
                                        <p>City</p>
                                        <CityDropdown
                                            selectedStateId={formData.state_id}
                                            selectedCityId={formData.city_id}
                                            onCityChange={handleCityChange}
                                        />
                                    </label>
                                    <label>
                                        <p>Website</p>
                                        <input type="text" name="website" value={formData.website} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Boardline Number</p>
                                        <input type="text" name="boardline_number" value={formData.boardline_number} onChange={handleChange} />
                                    </label>
                                </div>
                            </div>
                        </fieldset>

                        <fieldset>
                            <legend>Contact Details</legend>
                            <div className="form-grid">
                                <div className="form-group">
                                    <label>
                                        <p>First Name</p>
                                        <input type="text" name="first_name" value={contactData.first_name} onChange={handleContactChange} required />
                                    </label>
                                    <label>
                                        <p>Last Name</p>
                                        <input type="text" name="last_name" value={contactData.last_name} onChange={handleContactChange} required />
                                    </label>
                                    <label>
                                        <p>Email ID</p>
                                        <input type="email" name="email_id" value={contactData.email_id} onChange={handleContactChange} required />
                                    </label>
                                    <label>
                                        <p>Designation</p>
                                        <input type="text" name="designation" value={contactData.designation} onChange={handleContactChange} required />
                                    </label>
                                    <label>
                                        <p>Direct Number</p>
                                        <input type="text" name="direct_number" value={contactData.direct_number} onChange={handleContactChange} />
                                    </label>
                                    <label>
                                        <p>Mobile Number</p>
                                        <input type="text" name="mobile_number" value={contactData.mobile_number} onChange={handleContactChange} />
                                    </label>
                                </div>
                            </div>
                        </fieldset>

                        <fieldset>
                            <legend>Additional Details</legend>
                            <div className="form-grid">
                                <div className="form-group">
                                    <label>
                                        <p>Industry Vertical ID</p>
                                        <input type="number" name="industry_vertical_id" value={formData.industry_vertical_id} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Employee Size ID</p>
                                        <input type="number" name="employee_size_id" value={formData.employee_size_id} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Turnover Range ID</p>
                                        <input type="number" name="turnover_range_id" value={formData.turnover_range_id} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Server Brand</p>
                                        <input type="text" name="server_brand" value={formData.server_brand} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Number of Servers</p>
                                        <input type="text" name="number_of_servers" value={formData.number_of_servers} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Storage Brand</p>
                                        <input type="text" name="storage_brand" value={formData.storage_brand} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Type of Storage</p>
                                        <input type="text" name="type_of_storage" value={formData.type_of_storage} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Backup Storage Brand</p>
                                        <input type="text" name="backup_storage_brand" value={formData.backup_storage_brand} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>ERP</p>
                                        <input type="text" name="erp" value={formData.erp} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>CRM</p>
                                        <input type="text" name="crm" value={formData.crm} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>HRMS</p>
                                        <input type="text" name="hrms" value={formData.hrms} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>BI Reporting</p>
                                        <input type="text" name="bi_reporting" value={formData.bi_reporting} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Cloud</p>
                                        <input type="text" name="cloud" value={formData.cloud} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Database Brand</p>
                                        <input type="text" name="database_brand" value={formData.database_brand} onChange={handleChange} />
                                    </label>
                                    <label>
                                        <p>Endpoint</p>
                                        <input type="text" name="endpoint" value={formData.endpoint} onChange={handleChange} />
                                    </label>
                                </div>
                            </div>
                        </fieldset>

                        <div className="text-center mt-4">
                            <Button type="button" variant="primary" className="mx-2" size="sm" onClick={handleSubmit} disabled={submitting}>
                                {submitting ? 'Submitting...' : 'Submit'}
                            </Button>
                            <Button type="button" variant="secondary" className="mx-2" size="sm" onClick={handleReset} disabled={submitting}>
                                Reset
                            </Button>
                            <Button type="button" variant="outline-danger" className="mx-2" size="sm" onClick={() => window.history.back()}>
                                Cancel
                            </Button>
                        </div>
                    </form>
                    {submittedData && (
                        <div className="mt-4">
                            <h2>Submitted Data:</h2>
                            <pre>{JSON.stringify(submittedData, null, 2)}</pre>
                        </div>
                    )}
                    {error && <div className="error-message mt-4">{error}</div>}
                </div>
            </div>
        </div>
    );
};

export default CompanyForm;
