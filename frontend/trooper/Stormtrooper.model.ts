export interface Stormtrooper {
    name?: string;
    planetOfOrigin?: string;
    species?: string;
    type?: string;
}

export class DefaultStormtrooper implements Stormtrooper {
    constructor(
        public name?: string,
        public planetOfOrigin?: string,
        public species?: string,
        public type?: string
    ) {}
}