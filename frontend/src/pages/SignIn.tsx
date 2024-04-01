import {
	Flex,
	Heading,
	Image,
	FormControl,
	FormLabel,
	Input,
	Checkbox,
	Link,
	Button,
	Text,
	Box,
	Divider,
	AbsoluteCenter,
} from '@chakra-ui/react'
import signIn_bg from '../img/signIn-bg.jpg'
import logo from '../img/DigiDive.svg'
import google from '../img/google.svg'
import facebook from '../img/logos_facebook.svg'
import apple from '../img/apple.svg'
import github from '../img/mingcute_github-fill.svg'

const SignIn: React.FC = () => {
	return (
		<Flex
			bg='linear-gradient(104deg, #5A19BB 0%, #3323AA 27.33%, #C3308B 96.89%)'
			h='100vh'
			align='center'
			justify='center'
		>
			<Flex
				w='881px'
				maxH='621px'
				h='100%'
				borderRadius='16px'
				direction='row'
				bg='#fff'
				justify='space-between'
			>
				<Flex
					bg={`url(${signIn_bg}) center no-repeat`}
					bgSize='cover'
					maxW='440px'
					w='100%'
					align='center'
					justify='center'
					color='#fff'
					borderLeftRadius='16px'
				>
					<Heading fontSize='48px'>Welcome</Heading>
				</Flex>

				<Flex
					align='center'
					direction='column'
					maxW='440px'
					w='100%'
					p='16px 60px'
				>
					<Image src={logo} />
					<Heading mt='40px'>Log In</Heading>
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
					<Flex justify='space-between' mt='10px' w='100%'>
						<Checkbox>Remember me</Checkbox>
						<Link textDecor='underline' color='#9169F7' fontWeight='500'>
							Forgot password
						</Link>
					</Flex>
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
					<Text color='#919191' fontSize='12px' mt='8px'>
						By continuing, you agree{' '}
						<Link textDecor='underline'>Terms of Service</Link> and{' '}
						<Link textDecor='underline'>Privacy Policy.</Link>
					</Text>
					<Box position='relative' w='100%' mt='22px'>
						<Divider border='1px #D1D1D1 solid' w='100%' />
						<AbsoluteCenter bg='white' px='2' color='#000'>
							or
						</AbsoluteCenter>
					</Box>
					<Text mt='22px' alignSelf='flex-start'>
						Log in using
					</Text>
					<Flex justify='space-around' w='208px' mt='16px'>
						<Link _hover={{ bg: '#F8F9FA' }} p='8px'>
							<Image src={google} />
						</Link>
						<Link _hover={{ bg: '#F8F9FA' }} p='8px'>
							<Image src={facebook} />
						</Link>
						<Link _hover={{ bg: '#F8F9FA' }} p='8px'>
							<Image src={apple} />
						</Link>
						<Link _hover={{ bg: '#F8F9FA' }} p='8px'>
							<Image src={github} />
						</Link>
					</Flex>
				</Flex>
			</Flex>
		</Flex>
	)
}

export default SignIn
