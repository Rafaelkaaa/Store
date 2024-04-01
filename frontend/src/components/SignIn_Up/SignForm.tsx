import { FormControl, FormLabel, Input } from '@chakra-ui/react'

const SignForm: React.FC = () => {
	return (
		<FormControl isRequired mt='25px'>
			<FormLabel>Email</FormLabel>
			<Input
				focusBorderColor='purple.400'
				_focus={{
					border: '1px purple.400 solid',
				}}
				placeholder='Email'
			/>
			<FormLabel mt='16px'>Password</FormLabel>
			<Input
				focusBorderColor='purple.400'
				_focus={{
					border: '1px purple.400 solid',
				}}
				placeholder='Password'
			/>
		</FormControl>
	)
}

export default SignForm
