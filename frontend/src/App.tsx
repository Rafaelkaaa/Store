import { ChakraProvider } from '@chakra-ui/react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import ErrorPage from './pages/ErrorPage'
import HomePage from './pages/HomePage'

function App() {
	return (
		<>
			<ChakraProvider>
				<BrowserRouter>
					<Routes>
						<Route path='/' element={<HomePage />} />
						<Route path='*' element={<ErrorPage />} />
					</Routes>
				</BrowserRouter>
			</ChakraProvider>
		</>
	)
}

export default App
