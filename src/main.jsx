import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import CompanyForm from './components/CompanyForm.jsx'
import StateDropdown from './components/StateDropdown.jsx'
import CityDropdown from './components/CityDropdown.jsx'
createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
    <CompanyForm />
  </StrictMode>,
)
