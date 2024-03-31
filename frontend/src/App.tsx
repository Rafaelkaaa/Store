import { ChakraProvider } from '@chakra-ui/react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import ErrorPage from './pages/ErrorPage'
import HomePage from './pages/HomePage'
import ProductPage from "./pages/ProductPage.tsx";

function App() {
	return (
		<>
			<ChakraProvider>
				<BrowserRouter>
					<Routes>
						<Route path='/' element={<HomePage />} />
						<Route path='/product' element={<ProductPage />} />
						<Route path='*' element={<ErrorPage />} />
					</Routes>
				</BrowserRouter>
			</ChakraProvider>
		</>
	)
}

export default App
