import {Flex, Image, Text} from "@chakra-ui/react";
import Logo from "../../img/logo.png";
import InstagramLogo from "../../img/instagram.svg";
import YouTubeLogo from "../../img/youtube.svg";
import LinkedInLogo from "../../img/linkedIn.svg";
import TwitterLogo from "../../img/twitter.svg";

const FooterWelcomeSection: React.FC = () => {
    return (
        <Flex direction='column' gap='32px'>
            <Image src={Logo} alt='Logo' w='200px' h='60px'/>
            <Text fontSize='40px' fontWeight='600'
                  background='linear-gradient(104deg, #5FD8FF -7%, #9969FF 42.06%, #FF4B4B 91.11%)'
                  backgroundClip='text' maxW='470px'>The world’s biggest hub of Smart Products and
                Services</Text>
            <Flex gap='24px' align='center'>
                <Image src={InstagramLogo} alt='InstLogo'/>
                <Image src={YouTubeLogo} alt='YouTubeLogo'/>
                <Image src={LinkedInLogo} alt='LinkedInLogo'/>
                <Image src={TwitterLogo} alt='TwitterLogo'/>
            </Flex>
        </Flex>
    )
}

export default FooterWelcomeSection