import { Link, Text } from "@chakra-ui/react"

const SignSubText: React.FC = () => {
	return (
		<Text color='#919191' fontSize='12px' mt='8px'>
			By continuing, you agree{' '}
			<Link textDecor='underline'>Terms of Service</Link> and{' '}
			<Link textDecor='underline'>Privacy Policy.</Link>
		</Text>
	)
}

export default SignSubText
