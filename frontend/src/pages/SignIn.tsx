import { Flex, Heading, Image, Checkbox, Link } from '@chakra-ui/react'
import signIn_bg from '../assets/img/signIn-bg.jpg'
import logo from '../assets/img/DigiDive.svg'

import SignButton from '../components/SignIn_Up/SignButton'
import SignLinks from '../components/SignIn_Up/SignLinks'
import SignSubText from '../components/SignIn_Up/SigntSubText'
import SignForm from '../components/SignIn_Up/SignForm'

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
					<Heading mt='40px' fontSize='26px'>
						Log In
					</Heading>
					<SignForm />
					<Flex justify='space-between' mt='10px' w='100%'>
						<Checkbox>Remember me</Checkbox>
						<Link textDecor='underline' color='#9169F7' fontWeight='500'>
							Forgot password
						</Link>
					</Flex>
					<SignButton>Log in</SignButton>
					<SignSubText />
					<SignLinks />
				</Flex>
			</Flex>
		</Flex>
	)
}

export default SignIn
