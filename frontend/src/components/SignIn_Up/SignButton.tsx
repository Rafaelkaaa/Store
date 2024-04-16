import { Button } from '@chakra-ui/react'

const SignButton = () => {
	return (
		<>
			<Button
				colorScheme='blue'
				mt='19px'
				w='100%'
				h='42px'
				bg='linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
				_hover={{
					bg: 'linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)',
					top: '2px',
				}}
			>
				Log in
			</Button>
		</>
	)
}

export default SignButton
