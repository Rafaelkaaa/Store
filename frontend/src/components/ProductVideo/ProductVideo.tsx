import {Box} from "@chakra-ui/react";
import productVideo from './../../assets/videos/productVideo.mp4'

import s from './../Header/Header.module.css'
const ProductVideo: React.FC = () => {
    return (
        <Box  margin='0 auto' mt='19px'>
            <video className={s.video} autoPlay={true} playsInline={true} loop={true} muted={true}>
                <source src={productVideo} type="video/mp4" />
            </video>
        </Box>
    )
}

export default ProductVideo