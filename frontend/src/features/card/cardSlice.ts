import { createSlice } from '@reduxjs/toolkit';
import data from '../../data/cardData.json';

interface Card {
  id: number;
  name: string;
  price: number;
  sale: number
  description: string
}

interface CardState {
  cards: Card[];
}

const initialState: CardState = {
  cards: data
};

const cardSlice = createSlice({
  name: 'cards',
  initialState,
  reducers: {}
});

export default cardSlice.reducer;